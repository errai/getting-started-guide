package org.jboss.errai.starter.client.local.demos.widgets;

import javax.annotation.PostConstruct;
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
@Templated("SignUpFormWithName.html")
public class SignUpFormDataBindingWithKeyUp extends Composite implements HasModel<User> {

  @Inject
  @AutoBound
  private DataBinder<User> userBinder;

  @Inject
  @DataField
  @Bound(onKeyUp = true)
  public TextBox username;

  @Inject
  @DataField
  @Bound(onKeyUp = true)
  public TextBox name;

  @Inject
  @DataField
  @Bound(onKeyUp = true)
  public TextBox email;

  @Inject
  @DataField
  public Button cancel;

  @Inject
  @DataField
  public Button signin;

  @PostConstruct
  public void onLoad() {
    signin.setEnabled(false);
  }

  // Value changes must fire events for the DataBinder to update the model
  @EventHandler("cancel")
  public void cancel(ClickEvent e) {
    username.setValue("", true);
    name.setValue("", true);
    email.setValue("", true);
  }

  @Override
  public User getModel() {
    return userBinder.getModel();
  }

  @Override
  public void setModel(User user) {
    userBinder.setModel(user);
  }

}
