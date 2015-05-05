package org.jboss.errai.starter.client.local.modules;

import javax.inject.Inject;
import org.jboss.errai.starter.client.local.demos.pages.SignUpPageWithChainedDataBinding;
import org.jboss.errai.starter.client.local.demos.pages.SignUpPageWithDataBinding;
import org.jboss.errai.starter.client.local.demos.pages.SignUpPageWithDataBindingKeyUp;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated
public class ErraiDataBindingPage extends AbstractErraiModulePage {

  @Inject
  @DataField
  public TransitionAnchor<ErraiNavigationPage> backButton;

  @Inject
  @DataField
  public TransitionAnchor<SignUpPageWithDataBinding> dataBindingDemoButton;

  @Inject
  @DataField
  public TransitionAnchor<SignUpPageWithChainedDataBinding> chainedDBDemoButton;

  @Inject
  @DataField
  public TransitionAnchor<SignUpPageWithDataBindingKeyUp> keyUpDBDemoButton;
}
