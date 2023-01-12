package org.example.config;

import org.example.data_access.StudentDao;
import org.example.data_access.StudentDaoListImpl;
import org.example.service.UserInputService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ComponentScanConfig {
    @Bean
    public StudentDao studentDao() {
        return new StudentDaoListImpl();
    }

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
}
