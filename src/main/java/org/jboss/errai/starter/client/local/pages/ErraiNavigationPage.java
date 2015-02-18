package org.jboss.errai.starter.client.local.pages;

import javax.inject.Inject;
import org.jboss.errai.starter.client.local.NavigationModule;
import org.jboss.errai.starter.client.local.demopages.WelcomePageWithPageState;
import org.jboss.errai.starter.client.local.demopages.WelcomePageWithTransition;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;

/**
 * Created by Divya Dadlani <ddadlani@redhat.com>
 */
@Page(role = NavigationModule.class)
@Templated
public class ErraiNavigationPage extends AbstractErraiModulePage {

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

    @EventHandler("transitionDemoButton")
    public void goToTransitionDemo(ClickEvent e) {
        transitionDemo.go();
    }

    @EventHandler("pageStateDemoButton")
    public void goToPageStateDemo(ClickEvent e) {
        pageStateDemo.go();
    }

}
