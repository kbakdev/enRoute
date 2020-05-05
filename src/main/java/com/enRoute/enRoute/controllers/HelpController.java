package com.enRoute.enRoute.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelpController {

    @GetMapping("/help")

    public String help(String help) {
        return "help";
    }
}