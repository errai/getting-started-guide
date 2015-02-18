package org.jboss.errai.starter.client.local.pages;

import javax.inject.Inject;
import org.jboss.errai.starter.client.local.demopages.LoginPagePlain;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated
public class ErraiUIPage extends AbstractErraiModulePage {

  @Inject
  @DataField
  TransitionAnchor<LoginPagePlain> loginPagePlainAnchor;

}
