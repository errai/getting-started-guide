package org.jboss.errai.starter.client.local.pages;

import javax.inject.Inject;
import org.jboss.errai.starter.client.local.demos.LoginPage;
import org.jboss.errai.starter.client.local.demos.LoginPageWithEvents;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated
public class ErraiUIPage extends AbstractErraiModulePage {

  @Inject
  @DataField
  TransitionAnchor<LoginPage> loginFormAnchor;

  @Inject
  @DataField
  TransitionAnchor<LoginPageWithEvents> loginFormEventsAnchor;

}
