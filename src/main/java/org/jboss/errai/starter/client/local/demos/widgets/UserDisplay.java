package org.jboss.errai.starter.client.local.demos.widgets;

import javax.inject.Inject;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Templated
public class UserDisplay extends Composite {

  @Inject
  @DataField
  public HTML username;

  @Inject
  @DataField
  public HTML password;

  @Inject
  @DataField
  public HTML email;

  DataBinder<User> userBinder;

  public UserDisplay() {}

  public UserDisplay(User user) {
    userBinder = DataBinder.forModel(user);
    userBinder.bind(username, "username").bind(password, "password").bind(email, "email");
  }
}
