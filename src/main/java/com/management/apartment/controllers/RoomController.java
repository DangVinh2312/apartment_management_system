package com.management.apartment.controllers;

import com.management.apartment.dto.apartment.ApartmentRequestDTO;
import com.management.apartment.dto.room.RoomRequestDTO;
import com.management.apartment.services.ApartmentService;
import com.management.apartment.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @Autowired
    private ApartmentService apartmentService;

    @GetMapping(path = "/")
    public String getAllUsers(Model model) {
        model.addAttribute("rooms", roomService.getAllRooms());
        model.addAttribute("apartments", apartmentService.getAllApartments());
        return "./RoomView/index";
    }


    @PostMapping(value = "/save")
    public String saveRoom(@Valid RoomRequestDTO roomRequestDTO, BindingResult result) {
        if (result.hasErrors()) {
            return "./ApartmentView/index";
        }
        roomService.saveRoom(roomRequestDTO);
        return "redirect:/admin/apartments/";
    }
}
