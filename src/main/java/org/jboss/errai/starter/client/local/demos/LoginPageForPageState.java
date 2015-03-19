package org.jboss.errai.starter.client.local.demos;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated("LoginPageTemplate.html")
public class LoginPageForPageState extends AbstractDemoPage {

  @Inject
  @DataField
  private LoginFormPageState loginForm;

  @PostConstruct
  public void onLoad() {
    setPageTitle("Demo: LoginForm Page with TransitionAnchor");
    setInfo("Below is the LoginForm component as a Page. It works exactly as shown before, except that it is "
              + "annotated with <code>@Page</code>. As a result of this, users can navigate to the LoginFormPage"
              + " using its unique URL. <br/> This demo also showcases the use of the TransitionAnchor. The blue "
              + "\"Create an account\" button below uses a TransitionAnchor to take you to the Sign Up page.");
  }
}
