package org.jboss.errai.starter.client.local;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ui.nav.client.local.Navigation;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;


@EntryPoint
@ApplicationScoped
@Templated
public class GettingStartedGuide extends Composite {

    @Inject
    private Navigation navigation;

    @Inject
    @DataField
    private NavigationBar navbar;

    @Inject
    @DataField
    private SideBar sidebar;

    @Inject
    @DataField
    private SimplePanel content;


    @PostConstruct
    public void clientMain() {
        content.add(navigation.getContentPanel());
        RootPanel.get().add(this);

    }
}
