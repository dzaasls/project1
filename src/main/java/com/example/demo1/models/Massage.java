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
@Table(name = "massage")
public class Massage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idmassage;

    @Column(name = "id")
    private long id;

    @Column(name = "namemassage")
    private String namemassage;

    @Column(name = "emailmassage")
    private String emailmassage;

    @Column(name = "nomassage")
    private String nomassage;

    @Column(name = "massage")
    private String massage;

    @Column(name = "create_at")
    private String create_at;

    public long getIdmassage() {
        return idmassage;
    }

    public void setIdmassage(long idmassage) {
        this.idmassage = idmassage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamemassage() {
        return namemassage;
    }

    public void setNamemassage(String namemassage) {
        this.namemassage = namemassage;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

}
