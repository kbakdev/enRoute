package com.enRoute.enRoute.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enRoute.enRoute.service.AdminService;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/authenticatedAction")
    public String authenticatedAction() {

        adminService.authenticatedAction();
        return "/index";
    }
}