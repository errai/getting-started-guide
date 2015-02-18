package org.jboss.errai.starter.client.local.pages;

import org.jboss.errai.ui.nav.client.local.PageShown;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Composite;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
public abstract class AbstractErraiModulePage extends Composite {
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
