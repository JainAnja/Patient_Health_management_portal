/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.role;

import com.project.ecosystem.Ecosystem;
import com.project.enterprise.Enterprise;
import com.project.healthcare.PatientOrganization;
import com.project.organization.Organization;
import com.project.ui.admin.ReceptionistWorkAreaJPanel;
import com.project.ui.admin.ReceptionistWorkAreaJPanel;
import com.project.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Anjali
 */
public class ReceptionistRole extends Role {
    
    public ReceptionistRole() {
        super(Role.RoleType.RECEPTIONIST);
    }
    

    @Override
    public JPanel createWorkArea(JPanel containerPanel, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new ReceptionistWorkAreaJPanel(containerPanel, account, enterprise); //To change body of generated methods, choose Tools | Templates.
    }

}
