package com.enRoute.enRoute.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Kacper Bąk
 * The class is designed to redirect the user to the given address.
 * @return help
 */

@Controller
public class ContactController {

    @GetMapping("/contact")

    public String help(String help) {
        return "contact";
    }
}