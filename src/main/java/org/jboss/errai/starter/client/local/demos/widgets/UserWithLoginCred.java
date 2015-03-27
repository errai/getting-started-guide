package org.jboss.errai.starter.client.local.demos.widgets;

import org.jboss.errai.databinding.client.api.Bindable;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Bindable
public class UserWithLoginCred {

  private LoginCred loginCred;

  private String email;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LoginCred getLoginCred() {
    return loginCred;
  }

  public void setLoginCred(LoginCred loginCred) {
    this.loginCred = loginCred;
  }


}
