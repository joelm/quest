/*
 * This file contains proprietary information of Rule Financial.
 * Copying or reproduction without prior written approval is prohibited.
 *
 * <b>Copyright</b> (c) 2013
 * <b>Company</b> Corr Solutions
 */

package com.corrsolutions.quest.script;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Properties;


public class ScriptRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScriptRunner.class);

    private final List<Script> scripts;

    private Properties properties;

    private String[] scriptsToRun;


    public ScriptRunner(List<Script> scripts) {
        this.scripts = scripts;
    }


    public void executeAll() {
        LOGGER.info(" ------------------------------------------>");
        LOGGER.info("Running scripts...");
        try {
            for (Script script : scripts) {
                LOGGER.info("Fetching user defined properties in datasource.properties ...");
                String scriptsToRunProp = properties.getProperty("quest.scripts.run");
                scriptsToRun = scriptsToRunProp.split(",");
                if (checkScriptsToRun(script.getName())){
                    runScript(script);
                }
            }
            LOGGER.info("All scripts completed.");
            LOGGER.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        } catch (RuntimeException e) {
            LOGGER.error("Error running script: ", e);
            LOGGER.error("!!!!<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<!!!!");
        }
    }

    private void runScript(Script script) {
        LOGGER.info("########################################################");
        LOGGER.info("Starting {} - {}...", script.getName(), script.getDescription());
        script.execute();
        LOGGER.info("{} complete.", script.getName());
        LOGGER.info("########################################################");
    }

    /**
     *
     */
    private boolean checkScriptsToRun(String scriptName){
        for (String s : scriptsToRun){
            if (s.equalsIgnoreCase(scriptName)){
                return true;
            }
        }
        return false;
    }


    /**
     * @param args command-line arguments: ignored.
     */
    public static void main(String[] args) {
        final ApplicationContext context = initialiseAndGetSpringContext();
        LOGGER.info("Spring context fully loaded.");
        context.getBean(ScriptRunner.class).executeAll();
    }


    private static ApplicationContext initialiseAndGetSpringContext() {
        return new ClassPathXmlApplicationContext(
                "classpath:spring/scriptrunner-app-context.xml",
                "classpath:spring/scriptrunner-datasource.xml");
    }


    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}


