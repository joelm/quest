/*
 * This file contains proprietary information of Rule Financial.
 * Copying or reproduction without prior written approval is prohibited.
 *
 * <b>Copyright</b> (c) 2013
 * <b>Company</b> Corr Solutions
 */

package com.corrsolutions.quest.script;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Properties;


public abstract class AbstractScript implements Script {

  private String name;
  private String description;
  private JdbcTemplate questDataSource;
  private Properties properties;


   public String getName() {
       return name;
   }

  public String getDescription() {
    return description;
  }

  protected String getSql(String sqlKey) {
    return properties.getProperty(sqlKey);
  }

    public JdbcTemplate getQuestDataSource() {
        return questDataSource;
    }

    public Properties getProperties() {
        return properties;
    }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   public void setQuestDataSource(DataSource dataSource) {
     questDataSource = new JdbcTemplate(dataSource);
   }

  public void setProperties(Properties properties){
    this.properties = properties;
  }
}
