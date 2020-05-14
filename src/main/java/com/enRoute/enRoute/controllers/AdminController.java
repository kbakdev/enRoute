package com.enRoute.enRoute.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enRoute.enRoute.service.AdminService;

/**
 * @author Kacper Bąk
 * The control for the admin, which is responsible for managing the site by logging into the administrative panel.
 * If the person is not authorized to do so, he is redirected to "/index" address.
 */


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