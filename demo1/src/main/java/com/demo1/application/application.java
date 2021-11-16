package com.demo1.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.webservices"})
@ComponentScan(basePackages = {"com.springrestget.demo1"})
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
    }
}
