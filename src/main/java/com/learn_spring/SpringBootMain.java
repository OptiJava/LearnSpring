package com.learn_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan
public class SpringBootMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringBootMain.class);
    }
}
