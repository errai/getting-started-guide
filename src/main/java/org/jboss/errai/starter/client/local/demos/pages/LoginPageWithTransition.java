package org.jboss.errai.starter.client.local.demos.pages;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.starter.client.local.demos.BasicDemoPage;
import org.jboss.errai.starter.client.local.demos.widgets.LoginFormTransition;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated("DemoPageTemplate.html")
public class LoginPageWithTransition extends BasicDemoPage {

  @Inject
  @DataField("demoWidget")
  private LoginFormTransition loginForm;

  @PostConstruct
  public void onLoad() {
    setPageTitle("Demo: LoginForm Page with TransitionAnchor");
    setInfo("Below is the LoginForm component as a Page. It works exactly as shown before, except that it is "
              + "annotated with <code>@Page</code>. As a result of this, users can navigate to the LoginFormPage"
              + " using its unique URL. <br/> This demo also showcases the use of the TransitionAnchor. The blue "
              + "\"Create an account\" button below uses a TransitionAnchor to take you to the Sign Up page.");
  }

}
