package org.jboss.errai.starter.client.local.demos.widgets;

import org.jboss.errai.databinding.client.api.Bindable;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Bindable
public class User {

//  public static int nextUserId = 1;

  private String username;

  private String email;

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  private String password;

//  private int userId;

  public User() {
//    setUserId(nextUserId);
//    nextUserId++;
  }

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

//  public int getUserId() {
//    return userId;
//  }
//
//  public void setUserId(int userId) {
//    this.userId = userId;
//  }
}
