/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.healthcare;

import com.project.organization.Organization;
import com.project.role.DoctorRole;
import com.project.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class DoctorOrganization extends Organization {
    
    private ArrayList<DoctorRole> doctorList;

    public DoctorOrganization(String name) {
        super(name, Organization.Type.DOCTOR.getValue());
        this.doctorList = new ArrayList();
        
    }

    public ArrayList<DoctorRole> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<DoctorRole> doctorList) {
        this.doctorList = doctorList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
