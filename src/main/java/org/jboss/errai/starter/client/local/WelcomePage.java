package org.jboss.errai.starter.client.local;

import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.inject.Inject;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
@Page(role = DefaultPage.class)
@Templated("WelcomePage.html#main")
public class WelcomePage extends Composite{

    @PostConstruct
    public void setup() {

    }

}
