package org.jboss.errai.starter.client.local.demos.pages;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.starter.client.local.demos.BasicDemoPage;
import org.jboss.errai.starter.client.local.demos.widgets.SignUpFormDataBinding;
import org.jboss.errai.starter.client.local.demos.widgets.User;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.user.client.ui.HTML;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated
public class SignUpPageWithDataBinding extends BasicDemoPage {

  @Inject
  @DataField("demoWidget")
  public SignUpFormDataBinding signupForm;

  @Inject
  @DataField
  public HTML username;

  @Inject
  @DataField
  public HTML name;

  @Inject
  @DataField
  public HTML email;

  private DataBinder<User> userDataBinder;

  @PostConstruct
  public void onLoad() {
    userDataBinder = DataBinder.forModel(signupForm.getModel());
    userDataBinder.bind(username, "username").bind(name, "name").bind(email, "email");
    setPageTitle("Demo: Signup Form With Data Binding");
    setInfo("<p>This page demonstrates the use of a <code>DataBinder&lt;User&gt;</code> to bind a model of type "
              + "<code>User</code> to a Widget of type <code>SignUpForm</code>. The user information fields on the "
              + "right are updated with the User instance values as they are typed.</p>"
              + "<p>The user information fields are manually bound to the User model. "
              + "For more information on manual databinding, refer to the Documentation link above.</p>");

  }

}
