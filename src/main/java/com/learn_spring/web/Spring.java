package com.learn_spring.web;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan
public class Spring {
    public static void main(String[] args) {
        SpringApplication.run(Spring.class, args);
    }
}
