package com.enRoute.enRoute.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")

    public String login(String login) {
        return "login";
    }
}
