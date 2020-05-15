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

    @RequestMapping("/storehouse")
    public String getStoreHouse(Model model){
        model.addAttribute("storehouse", storeHouseRepository.findAll());
        return "storehouse";
    }
}