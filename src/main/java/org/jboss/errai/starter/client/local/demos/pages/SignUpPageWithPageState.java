package org.jboss.errai.starter.client.local.demos.pages;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.starter.client.local.demos.AbstractDemoPage;
import org.jboss.errai.starter.client.local.demos.widgets.SignUpFormPageState;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated("DemoPageTemplate.html")
public class SignUpPageWithPageState extends AbstractDemoPage {

  @Inject
  @DataField("demoWidget")
  public SignUpFormPageState signupForm;

  @PostConstruct
  public void onLoad() {
    title.setHTML("<h1>Demo: SignUp Page setting Page State</h1>");
    info.setHTML("<p>In this demo, the Sign Up page uses a <code>TransitionTo</code> to pass page state data (in this "
                   + "case, the username and email address) to the AccountCreated page.</p>"
                   + "<p>Once you fill in the fields, you can click \"Create Account\" and the "
                   + "<code>TransitionTo</code> will take you to the AccountCreated page, displaying the "
                   + "information you entered.</p>");
  }

}
