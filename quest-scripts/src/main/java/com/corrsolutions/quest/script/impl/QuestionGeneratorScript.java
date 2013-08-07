package com.corrsolutions.quest.script.impl;


import com.corrsolutions.geodata.dao.CountryDao;
import com.corrsolutions.geodata.dao.springjdbc.CountrySpringJdbcDao;
import com.corrsolutions.geodata.domain.City;
import com.corrsolutions.geodata.domain.Country;
import com.corrsolutions.quest.dao.QuestionDao;
import com.corrsolutions.quest.domain.Question;
import com.corrsolutions.quest.script.AbstractScript;
import com.corrsolutions.quest.service.GeoDataService;
import com.corrsolutions.quest.service.impl.GeoDataServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class QuestionGeneratorScript extends AbstractScript {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuestionGeneratorScript.class);

    private GeoDataService geoDataService;

    private QuestionDao questionDao;

    public QuestionGeneratorScript(GeoDataService geoDataService, QuestionDao questionDao){
        this.geoDataService = geoDataService;
        this.questionDao = questionDao;
    }

    @Override
    @Transactional(value = "hibTransactionManager")
    public void execute() {
        LOGGER.info("QuestionGeneratorScript is running!");

        try {
            LOGGER.info("Parsing Quest Properties... ");

            List<Country> countries = geoDataService.getAllCountries();
            LOGGER.info("countries: " + countries.size());
            System.out.println("countries: " + countries.size());

            List<Question> questions = new ArrayList<Question>();
            for (Country c : countries){
                System.out.println(c.toString());
                // generate questions   generateQuestions(questions);
                Question question = new Question();

                questions.add(question);
            }
            // save questions
            for (Question q : questions){
                questionDao.save(q);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }


    private List<Question> generateQuestions(List<Country> countries){
        List<Question> genQuestions = new ArrayList<Question>();
        // TODO
        List<City> cities = geoDataService.getAllCities();
        LOGGER.info("countries: " + countries.size());
        System.out.println("cities: " + cities.size());
        // TODO need answerDao
        // find macthing capital answer
        // TODO generate multiple potential answers using cities
        for (City c : cities){
            System.out.println(c.toString());
        }

        return genQuestions;
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
/*        QuestionGeneratorScript script = new QuestionGeneratorScript(geoDataService);
        script.setProperties(properties);
        script.execute();*/
    }
}
