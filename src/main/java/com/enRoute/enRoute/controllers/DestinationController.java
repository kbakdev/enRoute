package com.enRoute.enRoute.controllers;


import com.enRoute.enRoute.repositories.DestinationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DestinationController {

    private DestinationRepository destinationRepository;

    public DestinationController(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;

    }

    @RequestMapping("/destinations")
    public String getDestinations(Model model) {

        model.addAttribute("destinations", destinationRepository.findAll());

        return "destinations";
    }
}