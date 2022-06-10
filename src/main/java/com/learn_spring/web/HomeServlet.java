package com.learn_spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeServlet {
    @GetMapping("/")
    public ModelAndView getHome() {
        return new ModelAndView("index.html");
    }
}
