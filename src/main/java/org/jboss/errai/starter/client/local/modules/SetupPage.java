package org.jboss.errai.starter.client.local.modules;

import javax.inject.Inject;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page(role = DefaultPage.class)
@Templated
public class SetupPage extends AbstractErraiModulePage {

  @Inject
  @DataField
  public TransitionAnchor<ForgeAddonPage> nextButton;

}
