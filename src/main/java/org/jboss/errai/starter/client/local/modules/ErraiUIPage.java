package org.jboss.errai.starter.client.local.modules;

import javax.inject.Inject;
import org.jboss.errai.starter.client.local.demos.pages.LoginPage;
import org.jboss.errai.starter.client.local.demos.pages.LoginPageWithEvents;
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

  // Back and next buttons
  @Inject
  @DataField
  public TransitionAnchor<ErraiCDIPage> backButton;

  @Inject
  @DataField
  public TransitionAnchor<ErraiNavigationPage> nextButton;

  // Demo buttons
  @Inject
  @DataField
  TransitionAnchor<LoginPage> loginFormAnchor;

  @Inject
  @DataField
  TransitionAnchor<LoginPageWithEvents> loginFormEventsAnchor;

}
