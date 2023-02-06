/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.healthcare;

import com.project.organization.Organization;
import com.project.role.AdminRole;
import com.project.role.ReceptionistRole;
import com.project.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class AdminOrganization extends Organization{
    
    
    private ArrayList<AdminRole> adminList;

    public AdminOrganization(String name) {
        super(name, Organization.Type.ADMIN.getValue());
    }

    public ArrayList<AdminRole> getAdminList() {
        return adminList;
    }

    public void setAdminList(ArrayList<AdminRole> adminList) {
        this.adminList = adminList;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ReceptionistRole());
        roles.add(new AdminRole());
        return roles;
    }
    
    
}
