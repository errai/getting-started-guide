package org.jboss.errai.starter.client.local.pages;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageShowing;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated
public class SetupPage extends Composite {

    @PageShowing
    public void onPageLoad() {
        colorPage(this.getElement());
    }

    private static native void colorPage(Element e) /*-{

        $wnd.Rainbow.color(e, function() {
            console.log("Colored code elements");
        });
    }-*/;
}
