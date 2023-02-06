/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.insurance;

import com.project.organization.Organization;
import com.project.role.AdminRole;
import com.project.role.InsuranceClaimsManagerRole;
import com.project.role.ReceptionistRole;
import com.project.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class InsuranceClaimsOrganization extends Organization{

    public InsuranceClaimsOrganization(String name, String organizationType) {
        super(name, organizationType);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InsuranceClaimsManagerRole());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
}
