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
public class DonorRole extends Role{

    public DonorRole() {
        super(Role.RoleType.DONOR);
    }
    
    

    @Override
    public JPanel createWorkArea(JPanel containerPanel, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
