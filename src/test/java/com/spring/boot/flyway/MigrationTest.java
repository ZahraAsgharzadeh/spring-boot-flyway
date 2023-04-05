package com.spring.boot.flyway;

import static org.junit.Assert.assertEquals;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.flywaydb.core.Flyway;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MigrationTest {

    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    @Value("${spring.datasource.username}")
    private String datasourceUsername;

    @Value("${spring.datasource.password}")
    private String datasourcePassword;

    private Statement statement;
    
    @Before
    public void setUp() throws Exception {

        Flyway flyway = Flyway.configure().dataSource(datasourceUrl, datasourceUsername, datasourcePassword).load();
        flyway.migrate();

        Connection connection = DriverManager.getConnection(datasourceUrl, datasourceUsername, datasourcePassword);
        statement = connection.createStatement();
    }

    @Test
    public void testMathTableCreation() throws Exception {
        ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) AS count FROM information_schema.tables WHERE table_name = 'math'");
        resultSet.next();
        assertEquals(1, resultSet.getInt("count"));
    }
}