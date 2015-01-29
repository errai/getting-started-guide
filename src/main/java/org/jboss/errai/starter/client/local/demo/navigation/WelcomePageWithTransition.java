package org.jboss.errai.starter.client.local.demo.navigation;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import org.jboss.errai.starter.client.local.NavigationModule;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.nav.client.local.TransitionToRole;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
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

		@Inject
		@DataField Button goToNav;

		@Inject
		TransitionToRole<NavigationModule> goToNavPage;

		@EventHandler
		public void onGoToNavClicked(ClickEvent e) {
				goToNavPage.go();
		}

}
