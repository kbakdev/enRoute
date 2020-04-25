package com.enRoute.enRoute.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AppController {

    @RequestMapping("/**")
    public String handler(ModelMap model, HttpServletRequest request) {
        Authentication auth = SecurityContextHolder.getContext()
                .getAuthentication();
        model.addAttribute("uri", request.getRequestURI());
        model.addAttribute("user", auth.getName());
        model.addAttribute("roles", auth.getAuthorities());
        return "app";
    }
}