package com.enRoute.enRoute.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArchiveController {

    @GetMapping("/archive")

    public String archive(String archive) {
        return "archive";
    }
}