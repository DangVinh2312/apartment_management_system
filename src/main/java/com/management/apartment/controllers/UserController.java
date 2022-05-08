package com.management.apartment.controllers;

import com.management.apartment.dto.room.RoomRequestDTO;
import com.management.apartment.dto.user.UserRequestDTO;
import com.management.apartment.services.ApartmentService;
import com.management.apartment.services.RoomService;
import com.management.apartment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RoomService roomService;

    @GetMapping(path = "/")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("newCustomer", new UserRequestDTO());
        model.addAttribute("rooms", roomService.getAllRooms());
        return "./UserView/index";
    }

    @PostMapping(value = "/save")
    public String saveRoom(@Valid @ModelAttribute UserRequestDTO userRequestDTO, BindingResult result) {
        if (result.hasErrors()) {
            return "./UserView/index";
        }
        userService.saveUser(userRequestDTO);
        return "redirect:/admin/users/";
    }

    @GetMapping(path = "/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id, Model model) {
        userService.deleteUser(id);
        return "redirect:/admin/users/";
    }
}
