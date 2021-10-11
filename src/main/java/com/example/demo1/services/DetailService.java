/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo1.services;

import com.example.demo1.interfaces.DetailInterface;
import com.example.demo1.models.Detail;
import com.example.demo1.repositories.DetailRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Dell
 */
@Service
public class DetailService implements DetailInterface {

    @Autowired
    private DetailRepository detailRepository;
    
    @Override
    public List<Detail> getAll() {
        return detailRepository.findAll();
    }

    @Override
    public void store(Detail detail) {
        this.detailRepository.save(detail);
    }
}
