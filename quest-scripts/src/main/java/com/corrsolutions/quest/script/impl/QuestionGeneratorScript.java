package com.corrsolutions.quest.script.impl;


import com.corrsolutions.geodata.dao.CountryDao;
import com.corrsolutions.geodata.dao.springjdbc.CountrySpringJdbcDao;
import com.corrsolutions.geodata.domain.Country;
import com.corrsolutions.quest.script.AbstractScript;
import com.corrsolutions.quest.service.GeoDataService;
import com.corrsolutions.quest.service.impl.GeoDataServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class QuestionGeneratorScript extends AbstractScript {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuestionGeneratorScript.class);

    private GeoDataService geoDataService;

    public QuestionGeneratorScript(GeoDataService geoDataService){
        this.geoDataService = geoDataService;
    }


    public void execute() {
        LOGGER.info("QuestionGeneratorScript is running!");

        try {
            LOGGER.info("Parsing Quest Properties... ");
            List<Country> countries = geoDataService.getAllCountries();
            LOGGER.info("countries: " + countries.size());
            System.out.println("countries: " + countries.size());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }


    // For Testing only!!
    public static void main(String[] args){
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("C:\\_joel\\dev\\IdeaProjects\\quest\\quest-scripts\\src\\main\\config\\datasource.properties"));
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println(properties);

        CountryDao countryDao = new CountrySpringJdbcDao();
        GeoDataServiceImpl geoDataService = new GeoDataServiceImpl();
        geoDataService.setCountryDao(countryDao);
        QuestionGeneratorScript script = new QuestionGeneratorScript(geoDataService);
        script.setProperties(properties);
        script.execute();
    }
}
