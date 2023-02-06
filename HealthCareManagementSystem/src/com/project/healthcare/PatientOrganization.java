/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.healthcare;

import com.project.organization.Organization;
import com.project.role.PatientRole;
import com.project.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class PatientOrganization extends Organization {
    
    private ArrayList<PatientRole> patientList;

    public PatientOrganization(String name) {
        super(name, Organization.Type.PATIENT.getValue());
        this.patientList = new ArrayList<>();
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
