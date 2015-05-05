package org.jboss.errai.starter.client.local.demos.pages;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.starter.client.local.demos.BasicDemoPage;
import org.jboss.errai.starter.client.local.demos.widgets.SignUpFormDataBindingWithKeyUp;
import org.jboss.errai.starter.client.local.demos.widgets.User;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.user.client.ui.HTML;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated("SignUpPageWithDataBinding.html")
public class SignUpPageWithDataBindingKeyUp extends BasicDemoPage {
  @Inject
  @DataField("demoWidget")
  public SignUpFormDataBindingWithKeyUp signupForm;

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
    setInfo("<p>This page demonstrates the binding of text Widgets on <code>KeyUpEvents</code>. The UI widgets used in "
              + "this demo are identical to the previous demo. The only difference is that the widgets are bound with"
              + " the <code>onKeyUp</code> flag set, which means that the model values will update as soon as "
              + "some text is typed into the widgets.");
  }
}
