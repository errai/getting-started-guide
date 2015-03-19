package org.jboss.errai.starter.client.local.demos.widgets;

import javax.inject.Inject;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Templated
public class LoginForm extends Composite {

  @Inject
  @DataField
  public TextBox username;

  @Inject
  @DataField
  public PasswordTextBox password;

  @Inject
  @DataField
  public HTML loginLabel;

  public boolean noInfoEntered() {
    return ((password.getText().equals("")) || username.getText().equals(""));
  }

  public String getUsername() {
    return username.getText();
  }

  public void setUsername(String username) {
    this.username.setText(username);
  }

  public String getPassword() {
    return password.getText();
  }

  public void setPassword(String password) {
    this.password.setText(password);
  }

  public String getLoginLabel() {
    return loginLabel.getHTML();
  }

  public void setLoginLabel(String loginLabel) {
    this.loginLabel.setHTML(loginLabel);
  }

}
