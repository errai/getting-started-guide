package org.jboss.errai.starter.client.local.modules;

import javax.inject.Inject;
import org.jboss.errai.starter.client.local.NavigationModule;
import org.jboss.errai.starter.client.local.demos.pages.LoginPageWithTransition;
import org.jboss.errai.starter.client.local.demos.pages.SignUpPageWithPageState;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
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

  // Back and Next buttons
  @Inject
  @DataField
  public TransitionAnchor<ErraiUIPage> backButton;

  @Inject
  @DataField
  public TransitionAnchor<ErraiDataBindingPage> nextButton;

  // Demo buttons
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
