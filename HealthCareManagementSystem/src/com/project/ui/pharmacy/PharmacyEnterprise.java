/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.ui.pharmacy;

import com.project.enterprise.Enterprise;
import com.project.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class PharmacyEnterprise extends Enterprise {
    
    private String countryName;

    public PharmacyEnterprise(String name, EnterpriseType type) {
        super(name, type);
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
    
}
