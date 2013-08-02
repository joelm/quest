package com.corrsolutions.quest.script;


import javax.sql.DataSource;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/scriptrunner-app-context.xml", "classpath:spring/test-script-datasource.xml"})
@TransactionConfiguration(transactionManager = "hibTransactionManager", defaultRollback = true)
@Transactional
public abstract class AbstractScriptRunnerTest {

    @Autowired
    private Properties properties;

    @Autowired
    @Qualifier("questDataSource")
    private DataSource questDataSource;

    protected void initialise(AbstractScript script) throws IOException {
        properties = new Properties();
        final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        final URL url = classLoader.getResource("sql/sql.properties");
        properties.load(url.openStream());

        script.setProperties(properties);
        script.setQuestDataSource(questDataSource);
    }
}
