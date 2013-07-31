package com.corrsolutions.quest.script.impl;


import com.corrsolutions.quest.script.AbstractScript;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadCountriesScript extends AbstractScript{


    private static final Logger LOGGER = LoggerFactory.getLogger(LoadCountriesScript.class);

    public void execute() {
        LOGGER.info("LoadCountriesScript is running!");

        try {
            LOGGER.info("Parsing Quest Properties... ");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }


    // For Testing only!!
    public static void main(String[] args){
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("C:\\_joel\\dev\\IdeaProjects\\quest\\quest-scripts\\src\\main\\config\\quest.properties"));
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println(properties);

        LoadCountriesScript script = new LoadCountriesScript();
        script.setProperties(properties);
        script.execute();
    }

}
