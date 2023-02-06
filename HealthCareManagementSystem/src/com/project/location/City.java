/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.location;

import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class City {
    
    private String name;
    private ArrayList<String> zipcode;

    public City(String name) {
        this.name = name;
        this.zipcode = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getZipcode() {
        return zipcode;
    }

    public void setZipcode(ArrayList<String> zipcode) {
        this.zipcode = zipcode;
    }
    
    
    
    
}
