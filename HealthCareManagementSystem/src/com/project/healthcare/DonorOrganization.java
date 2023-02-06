/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.healthcare;

import com.project.organization.Organization;
import com.project.role.DonorRole;
import com.project.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class DonorOrganization extends Organization{
    
    private ArrayList<DonorRole> donorList;

    public DonorOrganization(String name) {
        super(name, Organization.Type.DONOR.getValue());
        this.donorList = new ArrayList();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
