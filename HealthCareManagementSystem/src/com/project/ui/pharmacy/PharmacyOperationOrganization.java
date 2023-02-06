/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.ui.pharmacy;

import com.project.organization.Organization;
import com.project.role.AdminRole;
import com.project.role.Pharmacist;
import com.project.role.ReceptionistRole;
import com.project.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class PharmacyOperationOrganization extends Organization{

    public PharmacyOperationOrganization(String name, String organizationType) {
        super(name, organizationType);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Pharmacist());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
}
