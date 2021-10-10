/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo1.services;

import com.example.demo1.interfaces.DonationInterface;
import com.example.demo1.models.Donation;
import com.example.demo1.repositories.DonationRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 */
@Service
public class DonationService implements DonationInterface {
     @Autowired
    private DonationRepository donationRepository;

    @Override
    public List<Donation> getAll() {
        return donationRepository.findAll();
    }

    @Override
    public void store(Donation donation) {
        this.donationRepository.save(donation);
    }

}   

