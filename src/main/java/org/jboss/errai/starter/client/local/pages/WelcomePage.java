package org.jboss.errai.starter.client.local.pages;

import com.google.gwt.user.client.ui.Composite;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
//@Templated
//@Page(role = DefaultPage.class)
//@ApplicationScoped
public class WelcomePage extends Composite {

    @PostConstruct
    public void setup() {
    }

}
