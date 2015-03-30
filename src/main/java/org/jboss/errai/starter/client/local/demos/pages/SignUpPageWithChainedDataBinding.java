package org.jboss.errai.starter.client.local.demos.pages;

import javax.inject.Inject;
import org.jboss.errai.starter.client.local.demos.AbstractDemoPage;
import org.jboss.errai.starter.client.local.demos.widgets.SignUpFormChainedBinding;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated("SignUpPageWithDataBinding.html")
public class SignUpPageWithChainedDataBinding extends AbstractDemoPage {

  @Inject
  @DataField("demoWidget")
  public SignUpFormChainedBinding signupForm;
}
