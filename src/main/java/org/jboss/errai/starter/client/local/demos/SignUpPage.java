package org.jboss.errai.starter.client.local.demos;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.starter.client.local.demos.LoginFormPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page(path = "/demos/navigation/transition/SignUp")
@Templated
public class SignUpPage extends Composite {

  @Inject
  @DataField
  public HTML title;

  @Inject
  @DataField
  public HTML info;

  @Inject
  @DataField
  public TextBox username;

  @Inject
  @DataField
  public PasswordTextBox password;

  @Inject
  @DataField
  public TextBox email;

  @Inject
  @DataField
  public Button cancel;

  @Inject
  @DataField
  public Button signin;

  @Inject
  TransitionTo<LoginFormPage> goToLogin;

  @PostConstruct
  public void onLoad() {
    title.setHTML("<h1>Demo: Sign Up Page using TransitionTo</h1>");
    info.setHTML("The Sign Up page uses a TransitionTo<LoginFormPage> to return to the LoginFormPage. <br/> If you "
                   + "click on the \"Sign in here\" button below, it will trigger a call to <code>TransitionTo.go()"
                   + "</code>, taking you back to the LoginFormPage. In addition, the Cancel button clears the "
                   + "fields, whereas the \"Create Account\" button currently does nothing.");
  }

  @EventHandler("cancel")
  public void cancel(ClickEvent e) {
    username.setText("");
    password.setText("");
    email.setText("");
  }

  @EventHandler("signin")
  public void goToLoginPage(ClickEvent e) {
    goToLogin.go();
  }


}
