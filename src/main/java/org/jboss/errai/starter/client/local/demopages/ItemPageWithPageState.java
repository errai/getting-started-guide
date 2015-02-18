package org.jboss.errai.starter.client.local.demopages;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import org.jboss.errai.starter.client.local.NavigationModule;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageShowing;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.nav.client.local.TransitionToRole;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.inject.Inject;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page(path = "item/{itemId}")
@Templated
public class ItemPageWithPageState extends Composite {

		@Inject
		@DataField
		Label printItemId;

		@PageState
		int itemId;

		@Inject
		@DataField
		Button backToNavButton;

		@Inject
		TransitionToRole<NavigationModule> backToNav;

		@PageShowing
		public void onPageLoad() {
				printItemId.setText("ItemID = " + itemId);
		}

		@EventHandler("backToNavButton")
		public void onBackButtonClicked(ClickEvent e) {
			backToNav.go();
		}
}
