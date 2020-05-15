package com.enRoute.enRoute.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Kacper Bąk
 * The class is designed to redirect the user to the given address.
 * @return map
 */

@Controller
public class MapController {

    @GetMapping("/map")
    public String map(String map) {
        return "map";
    }
}