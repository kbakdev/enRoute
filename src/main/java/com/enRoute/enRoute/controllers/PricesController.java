package com.enRoute.enRoute.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Kacper Bąk
 * The class is designed to redirect the user to the given address.
 * @return settings
 */

@Controller
public class PricesController {

    @GetMapping("/prices")
    public String settings(String settings) {
        return "prices";
    }
}