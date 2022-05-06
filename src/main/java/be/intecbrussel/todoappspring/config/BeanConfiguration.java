package be.intecbrussel.todoappspring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class BeanConfiguration {

    @Bean
    public Connection getConnection(
            @Value("${app.jdbc.connection}") String connectionString,
            @Value("${app.jdbc.username}") String userName,
            @Value("${app.jdbc.password}") String password
    ) throws SQLException {
        return DriverManager.getConnection(
                connectionString,
                userName,
                password
                );
    }

    @Bean
    public String getFakeConn() {
        return "this is a fake connection";
    }
}
