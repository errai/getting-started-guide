package org.jboss.errai.starter.client.local.demos;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page(path = "/demos/navigation/transition/LoginForm")
@Templated("LoginForm.html")
public class LoginFormPage extends LoginFormWithEvents {

  @Inject
  @DataField
  TransitionAnchor<SignUpPage> signup;

  @PostConstruct
  public void onLoad() {
    title.setHTML("<h1>Demo: LoginForm Page with TransitionAnchor</h1>");
    info.setHTML("Below is the LoginForm component as a Page. It works exactly as shown before, except that it is "
                   + "annotated with <code>@Page</code>. As a result of this, users can navigate to the LoginFormPage"
                   + " using its unique URL. <br/> This demo also showcases the use of the TransitionAnchor. The "
                   + "\"Create Account\" button below uses a TransitionAnchor to take you to the Sign Up page.");
  }

}
