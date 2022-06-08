package com.learn_spring.sample_bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class UserService {
    @Autowired
    Service service;

    @Autowired
    Properties prop;

    /*public UserService(Service service) {
        this.service = service;
    }*/

    @Bean
    public Properties getMap() {
        return new Properties();
    }
}
