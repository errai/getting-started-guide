package org.jboss.errai.starter.client.local.demos.widgets;

import org.jboss.errai.databinding.client.api.Bindable;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Bindable
public class User {

  private static int nextUserId;

  private String username;

  private String email;

  private int userId;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }
}
