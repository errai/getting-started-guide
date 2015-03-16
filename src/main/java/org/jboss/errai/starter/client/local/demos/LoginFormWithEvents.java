package org.jboss.errai.starter.client.local.demos;

import javax.annotation.PostConstruct;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Window;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated("LoginForm.html")
public class LoginFormWithEvents extends LoginForm {


  @PostConstruct
  public void onLoad() {
    title.setHTML("<h1>Demo: LoginForm With Event Handling");
    info.setHTML("This demo uses the same LoginForm template as the earlier LoginForm demo. <br/><br/> Both the "
                   + "Cancel and Sign In buttons on this page handle ClickEvents using @EventHandler methods. "
                   + "The Cancel button is injected as a Widget, and will clear the form of any data typed into "
                   + "it. <br/><br/> The Sign In button is manually instantiated as a button element, and will display "
                   + "the username entered into the form below.");
  }

  @EventHandler("cancel")
  public void onCancel(ClickEvent e) {
    username.setText("");
    password.setText("");
  }

  @EventHandler("login")
  public void onSubmit(ClickEvent e) {

    if ((password.getText().equals("")) || username.getText().equals("")) {
      Window.alert("Please enter a valid username and password.");
    }
    else {
      loginLabel.setText("Thank you for signing in, " + username.getText() + ".");
    }
  }

}
