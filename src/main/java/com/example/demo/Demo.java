package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Demo {

    public static Logger logger = LoggerFactory.getLogger(Demo.class);

    @PostConstruct
    public void init() {
        logger.info("Application started....");
    }

    public static void main(String[] args) {
        logger.info("Application executed....");
        SpringApplication.run(Demo.class, args);
    }
}
