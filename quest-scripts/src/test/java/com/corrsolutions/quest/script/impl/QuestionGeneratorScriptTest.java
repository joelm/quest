package com.corrsolutions.quest.script.impl;


import com.corrsolutions.quest.script.AbstractScriptRunnerTest;
import com.corrsolutions.quest.service.GeoDataService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class QuestionGeneratorScriptTest extends AbstractScriptRunnerTest {

    @Autowired
    private GeoDataService geoDataService;

    private static final Logger LOGGER = LoggerFactory.getLogger(QuestionGeneratorScriptTest.class);

    @SuppressWarnings("unchecked")
    @Test
    public void testRetriveCountriesAndGenrateQuestions() {
        QuestionGeneratorScript questionGeneratorScript = new QuestionGeneratorScript(geoDataService);
        try {
            initialise(questionGeneratorScript);
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.info("QuestionGeneratorScriptTest.testRetriveCountriesAndGenrateQuestions() " + e);
        }

        questionGeneratorScript.execute();

    }
}
