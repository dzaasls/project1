/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo1.services;

import com.example.demo1.interfaces.MassageInterface;
import com.example.demo1.models.Massage;
import com.example.demo1.repositories.MassageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dzakirah Septialisa
 */
@Service
public class MassageService implements MassageInterface {

    @Autowired
    private MassageRepository massageRepository;
    
    @Override
    public List<Massage> getAll() {
        return massageRepository.findAll();
    }

    @Override
    public void store(Massage massage) {
        this.massageRepository.save(massage);
    }
}

