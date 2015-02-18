package org.jboss.errai.starter.client.local.demopages;

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
@Page @Templated public class ItemPageWithTransition extends Composite {

		@Inject @DataField Button backButton;

		@Inject TransitionTo<WelcomePageWithTransition> goBack;

		@EventHandler("backButton") public void onBackButtonClicked(ClickEvent e) {
				goBack.go();
		}
}
