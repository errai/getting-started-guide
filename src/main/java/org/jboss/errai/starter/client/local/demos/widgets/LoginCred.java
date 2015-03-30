package org.jboss.errai.starter.client.local.demos.widgets;

import org.jboss.errai.databinding.client.api.Bindable;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Bindable
public class LoginCred {

  private String username;

  private String name;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
