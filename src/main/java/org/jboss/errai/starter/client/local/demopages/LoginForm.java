package org.jboss.errai.starter.client.local.demopages;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated
public class LoginForm extends Composite {

  @Inject
  @DataField
  private HTML info;

  @PostConstruct
  public void onLoad() {
    info.setHTML("This is the LoginForm component. "
                   + "It is a plain widget with no functionality that illustrates how to bind a template to an "
                   + "Errai UI component. <br /> <br />"
                   + "As we progress through this guide, more functionality will be added to this demo to help "
                   + "explain Errai's features.");
  }
}
