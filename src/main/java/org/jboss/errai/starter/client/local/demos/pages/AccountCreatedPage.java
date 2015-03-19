package org.jboss.errai.starter.client.local.demos.pages;

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
  public HTML usernm;

  @Inject
  @DataField
  public HTML emailId;

  @PageShown
  public void fillCredentials() {
    if (username != null && !username.equals("")) {
      usernm.setText(username);
    }

    if (email != null && !email.equals(""))
    emailId.setHTML(email);
  }
}
