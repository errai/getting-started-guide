package org.jboss.errai.starter.client.local.demo.navigation;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.inject.Inject;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page @Templated public class WelcomePageWithPageState extends Composite {

		@Inject
		@DataField
		Button itemId2;

		@Inject
		@DataField
		Button itemId4;

		@Inject

		TransitionTo<ItemPageWithPageState> goToItemPage;

		@EventHandler("itemId2")
		public void itemIdEquals2(ClickEvent e) {
				Builder<String, String> mapBuilder = ImmutableMultimap.builder();
				mapBuilder.put("itemId", "2");

				goToItemPage.go(mapBuilder.build());
		}

		@EventHandler("itemId4")
		public void itemIdEquals4(ClickEvent e) {
				Builder<String, String> mapBuilder = ImmutableMultimap.builder();
				mapBuilder.put("itemId", "4");

				goToItemPage.go(mapBuilder.build());
		}
}
