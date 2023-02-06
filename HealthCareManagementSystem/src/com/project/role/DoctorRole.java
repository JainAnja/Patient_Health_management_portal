/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.role;

import com.project.ecosystem.Ecosystem;
import com.project.enterprise.Enterprise;
import com.project.organization.Organization;
import com.project.ui.hospital.DoctorWorkAreaPanel;
import com.project.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Anjali
 */
public class DoctorRole extends Role {

    public DoctorRole() {
        super(Role.RoleType.DOCTOR);
    }
    

    @Override
    public JPanel createWorkArea(JPanel containerPanel, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new DoctorWorkAreaPanel(containerPanel, account, organization, enterprise, business); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
