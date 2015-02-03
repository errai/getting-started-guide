package org.jboss.errai.starter.client.local.pages;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.bus.client.api.base.MessageBuilder;
import org.jboss.errai.bus.client.api.messaging.Message;
import org.jboss.errai.bus.client.api.messaging.MessageCallback;
import org.jboss.errai.starter.client.local.NavigationModule;
import org.jboss.errai.starter.client.local.demo.navigation.WelcomePageWithPageState;
import org.jboss.errai.starter.client.local.demo.navigation.WelcomePageWithTransition;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageShowing;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.inject.Inject;

/**
 * Created by Divya Dadlani <ddadlani@redhat.com>
 */
@Page(role = NavigationModule.class)
@Templated
public class ErraiNavigationPage extends Composite{

    @Inject
    TransitionTo<WelcomePageWithTransition> transitionDemo;

    @Inject
    TransitionTo<WelcomePageWithPageState> pageStateDemo;

    @Inject
    @DataField
    Button transitionDemoButton;

    @Inject
    @DataField
    Button pageStateDemoButton;

    @PageShowing
    public void onPageLoad() {
        colorPage(this.getElement());
    }

    @EventHandler("transitionDemoButton")
    public void goToTransitionDemo(ClickEvent e) {
        transitionDemo.go();
    }

    @EventHandler("pageStateDemoButton")
    public void goToPageStateDemo(ClickEvent e) {
        pageStateDemo.go();
    }

    private static native void colorPage(Element e) /*-{

        $wnd.Rainbow.color(e, function() {
            console.log("Colored code elements");
        });
    }-*/;

}
