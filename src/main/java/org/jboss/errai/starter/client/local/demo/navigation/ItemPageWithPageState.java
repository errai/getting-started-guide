package org.jboss.errai.starter.client.local.demo.navigation;

import com.google.common.collect.Multimap;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import org.jboss.errai.starter.client.local.NavigationModule;
import org.jboss.errai.ui.nav.client.local.*;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.inject.Inject;
import java.util.Collection;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page
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
