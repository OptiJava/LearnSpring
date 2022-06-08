package com.learn_spring.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public ModelAndView signin(@RequestParam("email") String email, @RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
        return new ModelAndView("redirect:/home");
    }
}
