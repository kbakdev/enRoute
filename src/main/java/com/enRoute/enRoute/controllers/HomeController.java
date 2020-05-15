package com.enRoute.enRoute.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Kacper Bąk
 * This class is an extract from the spring-security sample 'sevlet-api'.
 * It's redirecting user to index.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome() {
        return "index";
    }
}