package com.springhow.examples.springboot.security.sessions.jdbc.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.session.JdbcSessionDataSourceInitializer;
import org.springframework.boot.autoconfigure.session.JdbcSessionProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(JdbcSessionProperties.class)
public class JdbcSessionConfig {
    @Bean
    public JdbcSessionDataSourceInitializer
    jdbcSessionDataSourceInitializer(@Qualifier("sessionDataSource") DataSource sessionDataSource,
                                     ResourceLoader resourceLoader,
                                     JdbcSessionProperties properties) {
        return new JdbcSessionDataSourceInitializer(sessionDataSource, resourceLoader, properties);
    }
}
