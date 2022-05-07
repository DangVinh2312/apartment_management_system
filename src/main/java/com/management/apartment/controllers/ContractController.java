package com.management.apartment.controllers;

import com.management.apartment.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/contracts")
public class ContractController {
    @Autowired
    private ContractService contractService;

    @GetMapping(path = "/")
    public String getAllContracts(Model model) {
        model.addAttribute("contracts", contractService.getAllContracts());
        return "./ContractView/index";
    }
}
