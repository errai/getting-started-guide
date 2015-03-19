package org.jboss.errai.starter.client.local.demos;

import javax.inject.Inject;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageShown;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated
public class AccountCreatedPage extends Composite {

  @PageState
  public String username;

  @PageState
  public String email;

  @Inject
  @DataField
  public HTML pageState;

  @PageShown
  public void fillCredentials() {

    String registered = new String("Thank you for registering with us! Your account was successfully created with the"
                                     + " username "
                                     +
                                     username + " and the email address " + email + ".");
    pageState.setText(registered);
  }
}
