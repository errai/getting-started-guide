package org.jboss.errai.starter.client.local.demo.navigation;

import com.google.gwt.user.client.ui.Composite;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.inject.Inject;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
@Templated
public class WelcomePageWithTransition extends Composite {
		@Inject
		@DataField
		TransitionAnchor<ItemPageWithTransition> itemLink;
}
