package org.jboss.errai.starter.client.local.modules;

import javax.inject.Inject;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated
public class ErraiCDIPage extends AbstractErraiModulePage {

  @Inject
  @DataField
  public
  TransitionAnchor<SetupPage> backButton;

  @Inject
  @DataField
  public
  TransitionAnchor<ErraiUIPage> nextButton;

}
