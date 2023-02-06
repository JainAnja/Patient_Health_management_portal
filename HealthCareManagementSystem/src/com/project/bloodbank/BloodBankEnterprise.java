/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.bloodbank;

import com.project.enterprise.Enterprise;
import com.project.organization.Organization;
import com.project.role.Role;
import java.util.ArrayList;

/**
 *
 * @author stutisingh
 */
public class BloodBankEnterprise extends Enterprise{

    private ArrayList<Organization> bloodBankOrganizationDirectory;

    public BloodBankEnterprise(String name, EnterpriseType type) {
        super(name, type);
        this.bloodBankOrganizationDirectory = new ArrayList<>();
    }

    public ArrayList<Organization> getBloodBankOrganizationDirectory() {
        return bloodBankOrganizationDirectory;
    }

    public void setBloodBankOrganizationDirectory(ArrayList<Organization> bloodBankOrganizationDirectory) {
        this.bloodBankOrganizationDirectory = bloodBankOrganizationDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
      
}
