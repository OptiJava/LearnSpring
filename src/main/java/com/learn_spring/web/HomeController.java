package com.learn_spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @GetMapping("/home")
    public ModelAndView home(HttpSession session) {
        if (session.getAttribute("email") == null) {
            return new ModelAndView("redirect:/signin");
        }
        return new ModelAndView("index.html");
    }

    @GetMapping("/")
    public ModelAndView redirectHome() {
        return new ModelAndView("redirect:/home");
    }
}
