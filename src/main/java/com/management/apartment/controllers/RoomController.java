package com.management.apartment.controllers;

import com.management.apartment.dto.room.RoomRequestDTO;
import com.management.apartment.services.ApartmentService;
import com.management.apartment.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @Autowired
    private ApartmentService apartmentService;

    @GetMapping(path = "/")
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", roomService.getAllRooms());
        model.addAttribute("newRoom", new RoomRequestDTO());
        model.addAttribute("apartments", apartmentService.getAllApartments());
        return "./RoomView/index";
    }


    @PostMapping(value = "/save")
    public String saveRoom(@Valid @ModelAttribute RoomRequestDTO roomRequestDTO, BindingResult result) {
        if (result.hasErrors()) {
            return "./RoomView/index";
        }
        roomService.saveRoom(roomRequestDTO);
        return "redirect:/admin/rooms/";
    }
}
