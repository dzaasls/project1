/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo1.interfaces;

import java.util.List;

/**
 *
 * @author Dell
 */
public interface DonationDetail {
    List<DonationDetail> getAll();
    void store(DonationDetail donationdetail);
    DonationDetail getById(long id);
    void delete(long id);
}
