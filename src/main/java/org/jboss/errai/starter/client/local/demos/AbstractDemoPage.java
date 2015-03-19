package org.jboss.errai.starter.client.local.demos;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;

/**
 * @author Divya Dadlani <ddadlani@redhat.com>
 */
public class AbstractDemoPage extends Composite {

  @Inject
  @DataField
  public HTML title;

  @Inject
  @DataField
  public HTML info;


  public void setPageTitle(String plainTextTitle) {
    String h1title = "<h1>" + plainTextTitle + "</h1>";
    this.title.setHTML(h1title);
  }

  public void setInfo(String info) {
    this.info.setHTML(info);
  }

}
