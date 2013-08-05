package com.corrsolutions.quest.script.impl;


import com.corrsolutions.geodata.dao.CountryDao;
import com.corrsolutions.geodata.dao.springjdbc.CountrySpringJdbcDao;
import com.corrsolutions.quest.script.AbstractScriptRunnerTest;
import com.corrsolutions.quest.service.GeoDataService;
import com.corrsolutions.quest.service.impl.GeoDataServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class QuestionGeneratorScriptTest extends AbstractScriptRunnerTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuestionGeneratorScriptTest.class);

    private QuestionGeneratorScript questionGeneratorScript;

    @Autowired
    private GeoDataServiceImpl geoDataService;

    @Autowired
    private CountrySpringJdbcDao countryDao;

    @Before
    public void init() {

        geoDataService.setCountryDao(countryDao);

        try {
            initialise(questionGeneratorScript = new QuestionGeneratorScript(geoDataService));
            countryDao.setProperties(questionGeneratorScript.getProperties());
        } catch (IOException e) {
            System.out.println(e);
            LOGGER.info("QuestionGeneratorScriptTest.init() " + e);
        }

    }

    @SuppressWarnings("unchecked")
    @Test
    public void testRetriveCountriesAndGenrateQuestions() {


        questionGeneratorScript.execute();

    }
}
