package org.jboss.errai.starter.client.local.pages;

import javax.inject.Inject;
import org.jboss.errai.starter.client.local.demopages.LoginForm;
import org.jboss.errai.starter.client.local.demopages.LoginFormWithEvents;
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
  TransitionAnchor<LoginForm> loginFormAnchor;

  @Inject
  @DataField
  TransitionAnchor<LoginFormWithEvents> loginFormEventsAnchor;

}
