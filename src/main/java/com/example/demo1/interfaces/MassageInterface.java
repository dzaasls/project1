/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo1.interfaces;

import com.example.demo1.models.Massage;
import java.util.List;



/**
 *
 * @author Dell
 */
public interface MassageInterface {
    List<Massage> getAll();
    void store(Massage massage);
    Massage getById(long id);
    void delete(long id);
}
