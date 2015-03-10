package org.jboss.errai.starter.client.local.demopages;

import javax.inject.Inject;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.common.collect.ImmutableMultimap;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated("SignUpPage.html")
public class SignUpPageSubmit extends SignUpPage {

  @Inject
  @DataField
  public Button submit;

  @Inject
  TransitionTo<AccountCreatedPage> accountCreated;

  @EventHandler("submit")
  public void submitNewAccount(ClickEvent e) {
    if ((username.getText().equals("")) || password.getText().equals("") || email.getText().equals("")) {
      Window.alert("Please fill out all fields.");
    }
    else {
      String user = username.getText();
      String emailId = email.getText();

      accountCreated.go(ImmutableMultimap.of("username", user, "email", emailId));
    }
  }
}
