package org.jboss.errai.starter.client.local.demos.widgets;

import org.jboss.errai.databinding.client.api.Bindable;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Bindable
public class LoginCred {

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  private String username;

  private String password;
}
