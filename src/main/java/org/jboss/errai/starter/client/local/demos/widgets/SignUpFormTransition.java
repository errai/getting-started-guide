package org.jboss.errai.starter.client.local.demos.widgets;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.starter.client.local.demos.pages.LoginPageWithTransition;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Templated("SignUpForm.html")
public class SignUpFormTransition extends Composite {

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
  @DataField
  public Button submit;

  @Inject
  TransitionTo<LoginPageWithTransition> goToLogin;

  @PostConstruct
  public void onLoad(){
    submit.setEnabled(false);
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
