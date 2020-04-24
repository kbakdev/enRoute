package com.enRoute.enRoute.controllers;

import com.enRoute.enRoute.repositories.StoreHouseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StoreHouseController {

    private StoreHouseRepository storeHouseRepository;

    private StoreHouseController(StoreHouseRepository storeHouseRepository){
        this.storeHouseRepository = storeHouseRepository;
    }

    @RequestMapping("/storehouses")
    public String getStoreHouses(Model model){
        model.addAttribute("storehouses", storeHouseRepository.findAll());
        return "storehouses";
    }
}