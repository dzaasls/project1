/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo1.controllers;

import com.example.demo1.interfaces.MessageInterface;
import com.example.demo1.models.Message;
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
public class MessageController {

    @Autowired
    private MessageInterface messageInterface;

    @GetMapping("/message")
    public String index(Model model) {
        model.addAttribute("list", messageInterface.getAll());
        return "message";
    }

    @GetMapping("/message/create")
    public String create(Model model) {
        
        Message message = new Message();
        model.addAttribute("message", message);
        
        return "index";
    }

    @PostMapping("/message/store")
    public String store(@ModelAttribute("message") Message message) {
        messageInterface.store(message);
        return "redirect:/index";
    }
}

