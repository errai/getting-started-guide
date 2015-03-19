package org.jboss.errai.starter.client.local.demos.pages;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.starter.client.local.demos.AbstractDemoPage;
import org.jboss.errai.starter.client.local.demos.widgets.LoginForm;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated("DemoPageTemplate.html")
public class LoginPage extends AbstractDemoPage {

  @Inject
  @DataField("demoWidget")
  public LoginForm loginForm;

  @PostConstruct
  public void onLoad() {
    setPageTitle("Demo: Sample Login Page");
    setInfo("This is the LoginForm component. "
              + "It is a plain widget with no functionality that illustrates how to bind a template to an "
              + "Errai UI component. <br /> <br />"
              + "As we progress through this guide, more functionality will be added to this demo to help "
              + "explain Errai's features.");
  }

}
