package com.spring.boot.flyway.configuration;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayConfiguration {

    /**
     * Validate flyway migration every time application runs
     * repair it if flyway needs to be repaired
     *
     * @return clean migrated flyway
     */
    @Bean
    public FlywayMigrationStrategy cleanMigrateStrategy() {

        return flyway -> {

            // to delete all tables -> flyway.clean();
            flyway.repair();
            flyway.migrate();
        };
    }
}
