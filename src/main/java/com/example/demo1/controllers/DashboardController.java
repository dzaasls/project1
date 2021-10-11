/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo1.controllers;

import com.example.demo1.interfaces.DonationInterface;
import com.example.demo1.models.Donation;
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
    private DonationInterface donationInterface;

    @GetMapping("/dashboard")
    public String index(Model model) {
        model.addAttribute("list", donationInterface.getAll());
        return "dashboard";
    }
    





}
