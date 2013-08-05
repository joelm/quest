
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.After;
import org.junit.Before;

import net.sourceforge.jtds.jdbc.Driver;


/**
 * When running unit tests for Daos, extend from this abstract class
 * as the connection is setup and maintained in one place.
 *
 */
public abstract class AbstractJdbcDaoTest
{

    protected BasicDataSource dataSource;
    protected Properties properties;

    @Before
    public void setup() throws FileNotFoundException, IOException
    {
        //set up a basic datasource for test
        dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/quest");
        dataSource.setUsername("quest");
        dataSource.setPassword("quest");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setDriverClassLoader(Driver.class.getClassLoader());

        //load the sql properties file
        properties = new Properties();
        final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        final URL url = classLoader.getResource("sql/sql.properties");
        properties.load(url.openStream());
    }

    @After
    public void teardown() throws SQLException {
        dataSource.close();
    }

}