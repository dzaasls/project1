/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo1.controllers;

import com.example.demo1.interfaces.UserInterface;
import com.example.demo1.models.User;
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
public class DashboardController {

    @Autowired
    private UserInterface userInterface;

    @GetMapping("/dashboard")
    public String index(Model model) {

        User user = new User();
        model.addAttribute("user", user);

        return "dashboard";
    }

    
}