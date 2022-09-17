package com.example.springpetclinic.controllers;

import com.example.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnersController {

    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping({"","/", "/index", "/index.html"})
    public String listVets(Model model) {

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
