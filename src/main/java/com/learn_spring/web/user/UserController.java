package com.learn_spring.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @GetMapping("/signup")
    public ModelAndView getSignup() {
        return new ModelAndView("signup.html");
    }

    @PostMapping("/signup")
    public ModelAndView postSignup(@RequestParam("email") String email, @RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
        User.user.put(email, new User(username, email, password.hashCode()));
        session.setAttribute("email", email);
        return new ModelAndView("redirect:/home");
    }

    @GetMapping("/signin")
    public ModelAndView getSignin() {
        return new ModelAndView("signin.html");
    }

    @PostMapping("/signin")
    public ModelAndView postSignup(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session) {
        if (User.user.get(email).passwordHash == password.hashCode()) {
            session.setAttribute("email", email);
            return new ModelAndView("redirect:/home");
        }
        return new ModelAndView("redirect:/signin");
    }
}
