package org.jboss.errai.starter.client.local.pages;

import javax.inject.Inject;
import org.jboss.errai.starter.client.local.NavigationModule;
import org.jboss.errai.starter.client.local.demos.LoginPageWithTransition;
import org.jboss.errai.starter.client.local.demos.SignUpPageWithPageState;
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
    TransitionTo<LoginPageWithTransition> transitionDemo;

    @Inject
    TransitionTo<SignUpPageWithPageState> pageStateDemo;

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
