package org.jboss.errai.starter.client.local.pages;

import javax.inject.Inject;
import org.jboss.errai.ui.nav.client.local.PageShown;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
public abstract class AbstractErraiModulePage extends Composite {

  @Inject
  @DataField
  public Button backButton;

  @Inject
  @DataField
  public Button nextButton;

  @PageShown
  public void onPageLoad() {
      colorPage(this.getElement());
  }

  private static native void colorPage(Element e) /*-{
      $wnd.Rainbow.color(e, function() {
        console.log("Colored code elements");
      });
  }-*/;
}
