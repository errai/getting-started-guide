package org.jboss.errai.starter.client.local.demos.pages;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.starter.client.local.demos.AbstractDemoPage;
import org.jboss.errai.starter.client.local.demos.widgets.SignUpFormChainedBinding;
import org.jboss.errai.starter.client.local.demos.widgets.User;
import org.jboss.errai.starter.client.local.demos.widgets.UserWithLoginCred;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.user.client.ui.HTML;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated("SignUpPageWithDataBinding.html")
public class SignUpPageWithChainedDataBinding extends AbstractDemoPage {

  @Inject
  @DataField("demoWidget")
  public SignUpFormChainedBinding signupForm;

  @Inject
  @DataField
  public HTML username;

  @Inject
  @DataField
  public HTML name;

  @Inject
  @DataField
  public HTML email;

  private DataBinder<UserWithLoginCred> userDataBinder;

  @PostConstruct
  public void onLoad() {
    userDataBinder = DataBinder.forModel(signupForm.getModel());
    userDataBinder.bind(username, "loginCred.username").bind(name, "loginCred.name").bind(email, "email");
    setPageTitle("Demo: Signup Form With Data Binding");
    setInfo("This page demonstrates the use of a <code>DataBinder&lt;User&gt;</code> to bind a model of type "
              + "<code>User</code> to a Widget of type <code>SignUpForm</code>. The user information fields on the right"
              + " are updated with the User instance values as they are typed. The Cancel button clears the fields but"
              + " the other buttons are inactive."
              + "<br /><br /> The user information fields are manually bound to the User model. "
              + "For more information on manual databinding, refer to the Documentation link above.");
  }
}