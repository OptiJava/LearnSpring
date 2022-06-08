package com.learn_spring.read_resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

@Component
@Configuration
@ComponentScan
public class ReadResourcesMain {
    @Value("classpath:/ReadResources/Config.properties")
    private Resource resource;

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ReadResourcesMain.class);
    }

    @PostConstruct
    public void init() throws IOException {
        try (var reader = new BufferedReader(new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8))) {
            System.out.println(reader.lines().collect(Collectors.joining("\n")));
        }
    }
}
