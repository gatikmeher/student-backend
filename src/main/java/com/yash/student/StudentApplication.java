package com.yash.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class StudentApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }

}