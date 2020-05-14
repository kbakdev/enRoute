package com.enRoute.enRoute.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

/** @author Kacper Bąk
 * The class is designed to show all information about the logged in user. It was created with the application testing in mind.
 * @param uri
 * @param user
 * @param roles
 * @return userInfo
 */


@Controller
public class AppController {

    @org.springframework.web.bind.annotation.GetMapping("/userInfo")
    public String handler(ModelMap model, HttpServletRequest request) {
        Authentication auth = SecurityContextHolder.getContext()
                .getAuthentication();
        model.addAttribute("uri", request.getRequestURI());
        model.addAttribute("user", auth.getName());
        model.addAttribute("roles", auth.getAuthorities());
        return "userInfo";
    }
}