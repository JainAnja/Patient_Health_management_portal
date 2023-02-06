/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.role;

import com.project.ecosystem.Ecosystem;
import com.project.enterprise.Enterprise;
import com.project.organization.Organization;
import com.project.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Anjali
 */
public abstract class Role {
    
    private RoleType roleType;
    
    public enum RoleType {
        SYSADMIN("System Admin"),
        ENTERPRISEADMIN("Enterprise Admin"),
        ORGANIZATIONADMIN("Organization Admin"),
        DOCTOR("Doctor"),
        ADMIN("Admin"),
        NURSE("Nurse"),
        RECEPTIONIST("Receptionist"),
        INSURANCE("Insurance Claims Manager"),
        PATIENT("Patient"),
        PHARMACIST("Pharmacist"),
        BLOOD_INVENTORY_MANAGER("Blood Inventory Manager"),
        BLOOD_SUPPLY_MANAGER("Blood Supply Manager"),
        LABASSISTANT("La"),
        DONOR("Donor");
       
        
        private String value;
        private RoleType(String value){
            this.value = value;
            
        }
         public String getValue() {
            return value;
        }

        
    }
    
    public abstract JPanel createWorkArea(JPanel containerPanel, UserAccount account, Organization organization,Enterprise enterprise, Ecosystem business);


    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Role(Role.RoleType type) {
        this.roleType = type;
    }
    
    
      
    
    
}
