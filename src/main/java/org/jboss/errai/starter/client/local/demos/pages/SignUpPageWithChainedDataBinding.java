package org.jboss.errai.starter.client.local.demos.pages;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.starter.client.local.demos.BasicDemoPage;
import org.jboss.errai.starter.client.local.demos.widgets.SignUpFormChainedBinding;
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
public class SignUpPageWithChainedDataBinding extends BasicDemoPage {

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
    setInfo("<p>This page demonstrates the binding of chained data models to a Widget. The UI widgets used in "
              + "this demo are identical to the previous demo. The difference is that the Username and Name fields are "
              + "bound to a <code>LoginCred</code> model which is chained to the original <code>User</code> model.</p>");
  }
}
