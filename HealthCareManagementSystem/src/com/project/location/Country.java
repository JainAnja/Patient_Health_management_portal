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
public class Country {
    
    private String name;
    private ArrayList<State> states;

    public Country(String name) {
        this.name = name;
        this.states = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }
    
    
     
}
