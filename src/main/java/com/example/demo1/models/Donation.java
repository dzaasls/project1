/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name="donation")
public class Donation {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long donationid;
    
    @Column(name="donationname")
    private String donationname;
    
    @Column(name="donationtotal")
    private long donationtotal;

    @Column(name="description")
    private String description;
    
    @Column(name="create_at")
    private String create_at;

    public long getDonationid() {
        return donationid;
    }

    public void setDonationid(long donationid) {
        this.donationid = donationid;
    }

    public String getDonationname() {
        return donationname;
    }

    public void setDonationname(String donationname) {
        this.donationname = donationname;
    }

    public long getDonationtotal() {
        return donationtotal;
    }

    public void setDonationtotal(long donationtotal) {
        this.donationtotal = donationtotal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    
}
