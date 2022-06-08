package com.learn_spring.web.user;

import java.util.HashMap;
import java.util.Map;

public class User {

    final static Map<String, User> user = new HashMap<>();

    public String username;
    public String email;
    public int passwordHash;

    public User(String username, String email, int passwordHash) {
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
    }
}
