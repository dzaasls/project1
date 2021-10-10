/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo1.controllers;

import com.example.demo1.interfaces.MassageInterface;
import com.example.demo1.models.Massage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Dell
 */
@Controller
public class MassageController {

    @Autowired
    private MassageInterface massageInterface;

    @GetMapping("/massage")
    public String index(Model model) {
        model.addAttribute("list", massageInterface.getAll());
        return "massage";
    }

    @GetMapping("/massage/create")
    public String create(Model model) {
        
        Massage massage = new Massage();
        model.addAttribute("massage", massage);
        
        return "create";
    }

    @PostMapping("/massage/store")
    public String store(@ModelAttribute("massage") Massage massage) {
        massageInterface.store(massage);
        return "redirect:/index";
    }
}
