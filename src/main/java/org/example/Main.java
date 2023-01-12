package org.example;

import org.example.config.ComponentScanConfig;
import org.example.data_access.StudentDao;
import org.example.service.UserInputService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contextStudentDao = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = contextStudentDao.getBean(StudentDao.class);

        AnnotationConfigApplicationContext contextUserInputService = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        UserInputService userInputService =contextUserInputService.getBean(UserInputService.class);
    }
}