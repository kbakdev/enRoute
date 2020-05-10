package com.enRoute.enRoute.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This class is an extract from the spring-security sample 'sevlet-api'.
 *
 * @author Kacper Bąk
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome() {
        return "index";
    }
}