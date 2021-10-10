/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo1.services;

import com.example.demo1.interfaces.MessageInterface;
import com.example.demo1.models.Message;
import com.example.demo1.repositories.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Dell
 */
@Service
public class MessageService implements MessageInterface {

    @Autowired
    private MessageRepository messageRepository;
    
    @Override
    public List<Message> getAll() {
        return messageRepository.findAll();
    }

    @Override
    public void store(Message message) {
        this.messageRepository.save(message);
    }
}
