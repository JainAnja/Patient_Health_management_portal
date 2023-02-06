/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.healthcare;

import com.project.organization.Organization;
import com.project.role.NurseRole;
import com.project.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class NurseOrganization extends Organization {

    
    private ArrayList<NurseRole> nurseList;

    public NurseOrganization(String name) {
        super(name, Organization.Type.NURSE.getValue());
        this.nurseList = new ArrayList();
    }

    public ArrayList<NurseRole> getNurseList() {
        return nurseList;
    }

    public void setNurseList(ArrayList<NurseRole> nurseList) {
        this.nurseList = nurseList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
}
