package org.jboss.errai.starter.client.local.demopages;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.HeadingElement;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated
public class LoginForm extends Composite {

  @Inject
  @DataField
  public HTML title;

  @Inject
  @DataField
  public HTML info;

  @DataField
  public Element form = DOM.createForm();

  @Inject
  @DataField
  public TextBox username;

  @Inject
  @DataField("passwd")
  public PasswordTextBox password;

  @Inject
  @DataField
  public Button cancel;

  // Manual instantiation is also permitted. Using @Inject is optional
  @DataField
  public Element login = DOM.createButton();

  @Inject
  @DataField
  HTML loginLabel;

  @PostConstruct
  public void onLoad() {
    title.setHTML("<h1>Demo: Sample Login Page");
    info.setHTML("This is the LoginForm component. "
                   + "It is a plain widget with no functionality that illustrates how to bind a template to an "
                   + "Errai UI component. <br /> <br />"
                   + "As we progress through this guide, more functionality will be added to this demo to help "
                   + "explain Errai's features.");
  }
}
