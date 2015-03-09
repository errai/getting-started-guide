package org.jboss.errai.starter.client.local.demopages;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated("LoginForm.html")
public class LoginPageWithEvents extends Composite {

  @Inject
  @DataField
  HTML info;

  @DataField
  private Element form = DOM.createForm();

  @Inject
  @DataField
  private TextBox username;

  @Inject
  @DataField("passwd")
  private PasswordTextBox password;

  @Inject
  @DataField
  private Button cancel;

  // Manual instantiation is also permitted. Using @Inject is optional
  @DataField
  private Element login = DOM.createButton();

  @Inject
  @DataField
  HTML loginLabel;

  @PostConstruct
  public void onLoad() {
    info.setText("This demo uses the same LoginForm template as the earlier LoginForm demo. \n Both the Cancel and "
                   + "Sign In buttons on this page handle ClickEvents using @EventHandler methods."
                   + "The Cancel button is injected as a Widget, and will clear the form of any data typed into "
                   + "it. \n The Sign In button is manually instantiated as a button element, and will display "
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
      } else {
        loginLabel.setText("Thank you for signing in, " + username.getText()+ ".");
      }
  }

}
