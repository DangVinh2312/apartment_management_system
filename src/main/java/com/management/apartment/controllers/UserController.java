package com.management.apartment.controllers;

import com.management.apartment.dto.user.UserRequestDTO;
import com.management.apartment.services.ApartmentService;
import com.management.apartment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private ApartmentService apartmentService;

    @GetMapping(path = "/")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("newCustomer", new UserRequestDTO());
        model.addAttribute("apartments", apartmentService.getAllApartments());
        return "./UserView/index";
    }
}
