package com.management.apartment.controllers;

import com.management.apartment.dto.apartment.ApartmentRequestDTO;
import com.management.apartment.services.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin/apartments")
public class ApartmentController {
    @Autowired
    private ApartmentService apartmentService;

    @GetMapping(path = "/")
    public String getAllApartments(Model model) {
        model.addAttribute("apartments", apartmentService.getAllApartments());
        model.addAttribute("newApartment", new ApartmentRequestDTO());
        return "./ApartmentView/index";
    }

    @PostMapping(value = "/save")
    public String saveApartment(@Valid @ModelAttribute  ApartmentRequestDTO apartmentRequestDTO, BindingResult result) {
        if (result.hasErrors()) {
            return "./ApartmentView/index";
        }
        apartmentService.saveApartment(apartmentRequestDTO);
        return "redirect:/admin/apartments/";
    }
}
