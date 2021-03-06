package org.jboss.errai.starter.client.local.demos.pages;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.starter.client.local.demos.BasicDemoPage;
import org.jboss.errai.starter.client.local.demos.widgets.SignUpFormTransition;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated("DemoPageTemplate.html")
public class SignUpPageWithTransition extends BasicDemoPage {

  @Inject
  @DataField("demoWidget")
  private SignUpFormTransition signupForm;

  @PostConstruct
  public void onLoad() {
    setPageTitle("<h1>Demo: SignUp Page with TransitionTo</h1>");
    setInfo("This is the SignUp page, that navigates to the LoginPage using a <code>TransitionTo&lt;LoginPage&gt;"
              + "</code>.<br/> <br/> If you click on "
              + "the \"Sign in here\" button below, it will trigger a call to <code>TransitionTo.go()"
              + "</code>, taking you back to the LoginPage.");
  }

}
