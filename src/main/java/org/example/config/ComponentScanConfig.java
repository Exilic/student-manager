package org.example.config;

import org.example.data_access.StudentDao;
import org.example.data_access.StudentDaoListImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ComponentScanConfig {
    @Bean
    public StudentDao studentDao() {
        return new StudentDaoListImpl();
    }
}
