package org.jboss.errai.starter.client.local.demos;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.starter.client.local.demos.widgets.LoginFormEvents;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated("LoginPageTemplate.html")
public class LoginPageWithEvents extends AbstractDemoPage {

  @Inject
  @DataField
  private LoginFormEvents loginForm;

  @PostConstruct
  public void onLoad() {
    setPageTitle("Demo: LoginForm With Event Handling");
    setInfo("This demo uses the same LoginForm template as the earlier LoginForm demo. <br/><br/> Both the "
              + "Cancel and Sign In buttons on this page handle ClickEvents using <code>@EventHandler</code> "
              + "methods. "
              + "The Cancel button is injected as a Widget, and will clear the form of any data typed into "
              + "it. <br/><br/> The Sign In button is manually instantiated as a button element, and will display "
              + "the username entered into the form below.");

  }

}
