/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.role;

import com.project.ecosystem.Ecosystem;
import com.project.enterprise.Enterprise;
import com.project.organization.Organization;
import com.project.ui.bloodbank.BloodSupplyWorkAreaPanel;
import com.project.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author stutisingh
 */
    public class BloodSupplyManagerRole extends Role {
    public BloodSupplyManagerRole() {
        super(Role.RoleType.BLOOD_SUPPLY_MANAGER);
    }
    

    @Override
    public JPanel createWorkArea(JPanel containerPanel, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        //throw new UnsupportedOperationException("Not supported yet.");//To change body of generated methods, choose Tools | Templates.
        return new BloodSupplyWorkAreaPanel(containerPanel, account, enterprise);
    }

    
    
    
}
    

