package com.learn_spring.sample_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SampleBeanMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SampleBeanMain.class);
        UserService s = context.getBean(UserService.class);
        System.out.println(s.service);
        System.out.println(s.prop);
    }
}
