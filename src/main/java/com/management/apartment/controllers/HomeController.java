package com.management.apartment.controllers;

import com.management.apartment.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class HomeController {
    @Autowired
    private HomeService homeService;

    @GetMapping(path = "/")
    public String getAllUsers(Model model) {
        return "./HomeAdminView/index";
    }
}

