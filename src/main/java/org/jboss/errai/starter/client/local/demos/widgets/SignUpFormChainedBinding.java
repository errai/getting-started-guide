package org.jboss.errai.starter.client.local.demos.widgets;

import javax.inject.Inject;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.client.widget.HasModel;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Templated("SignUpForm.html")
public class SignUpFormChainedBinding extends Composite implements HasModel<UserWithLoginCred> {

  @Inject
  @AutoBound
  private DataBinder<UserWithLoginCred> userBinder;

  @Inject
  @DataField
  @Bound("loginCred.username")
  public TextBox username;

  @Inject
  @DataField
  @Bound("loginCred.password")
  public TextBox password;

  @Inject
  @DataField
  @Bound
  public TextBox email;

  @Inject
  @DataField
  public Button cancel;

  // Value changes must fire events for the DataBinder to update the model
  @EventHandler("cancel")
  public void cancel(ClickEvent e) {
    username.setValue("", true);
    password.setValue("", true);
    email.setValue("", true);
  }

  @Override
  public UserWithLoginCred getModel() {
    return userBinder.getModel();
  }

  @Override
  public void setModel(UserWithLoginCred user) {
    userBinder.setModel(user);
  }

}
