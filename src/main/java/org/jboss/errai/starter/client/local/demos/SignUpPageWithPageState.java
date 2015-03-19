package org.jboss.errai.starter.client.local.demos;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.starter.client.local.demos.widgets.SignUpFormPageState;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated("SignUpPageTemplate.html")
public class SignUpPageWithPageState extends AbstractDemoPage {

  @Inject
  @DataField
  public SignUpFormPageState signupForm;

  @PostConstruct
  public void onLoad() {
    title.setHTML("<h1>Demo: Sign Up Page using TransitionTo</h1>");
    info.setHTML("In this demo, the Sign Up page uses a <code>TransitionTo</code> to pass page state data (in this "
                   + "case, the username and email address) to the AccountCreated page. <br /> As before, the \"Sign "
                   + "In\" button takes you to the LoginPage; and the \"Cancel\" button clears all fields.");
  }

}
