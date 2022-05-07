package com.management.apartment.controllers;

import com.management.apartment.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/bills")
public class BillController {
    @Autowired
    private BillService billService;

    @GetMapping(path = "/")
    public String getAllUsers(Model model) {
        model.addAttribute("bills", billService.getAllBills());
        return "./BillView/index";
    }
}
