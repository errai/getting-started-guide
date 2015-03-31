package org.jboss.errai.starter.client.local.demos.widgets;

import javax.inject.Inject;
import org.jboss.errai.starter.client.local.demos.pages.SignUpPageWithPageState;
import org.jboss.errai.starter.client.local.demos.pages.SignUpPageWithTransition;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Templated("LoginForm.html")
public class LoginFormPageState extends Composite {

  @Inject
  @DataField
  public TextBox username;

  @Inject
  @DataField
  public PasswordTextBox password;

  @Inject
  @DataField
  public HTML loginLabel;

  @Inject
  @DataField
  public Button cancel;

  @Inject
  @DataField
  public Button login;

  @Inject
  @DataField
  TransitionAnchor<SignUpPageWithPageState> signup;

  public String getUsername() {
    return username.getText();
  }

  public void setUsername(String name) {
    username.setText(name);
  }

  public String getPassword() {
    return password.getText();
  }

  public void setPassword(String passwd) {
    password.setText(passwd);
  }

  public boolean noInfoEntered() {
    return ((getPassword().equals("")) || getUsername().equals(""));
  }

  @EventHandler("cancel")
  public void onCancel(ClickEvent e) {
    username.setText("");
    password.setText("");
  }

  @EventHandler("login")
  public void onLogin(ClickEvent e) {
    if (noInfoEntered()) {
      Window.alert("Please enter a valid username and password.");
    }
    else {
      loginLabel.setHTML("Thank you for signing in, " + getUsername() + ".");
      setUsername("");
      setPassword("");
    }
  }
}
