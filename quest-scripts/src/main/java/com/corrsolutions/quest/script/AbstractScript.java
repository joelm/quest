/*
 * This file contains proprietary information of Rule Financial.
 * Copying or reproduction without prior written approval is prohibited.
 *
 * <b>Copyright</b> (c) 2013
 * <b>Company</b> Corr Solutions
 */

package com.corrsolutions.quest.script;

import java.util.Properties;


public abstract class AbstractScript implements Script {

  private String name;
  private String description;
  private Properties properties;

  public String getName() {
    return name;
  }

  public Properties getProperties() {
        return properties;
    }

  public String getDescription() {
    return description;
  }

  protected String getSql(String sqlKey) {
    return properties.getProperty(sqlKey);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setProperties(Properties properties){
    this.properties = properties;
  }
}
