/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.role;

import com.project.ecosystem.Ecosystem;
import com.project.enterprise.Enterprise;
import com.project.organization.Organization;
import com.project.ui.insurance.InsuranceClaimsManagerWorkAreaJPanel;
import com.project.ui.pharmacy.PharmacistWorkAreaPanel;
import com.project.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Anjali
 */
public class InsuranceClaimsManagerRole extends Role{

    public InsuranceClaimsManagerRole() {
        super(Role.RoleType.INSURANCE);
    }

    @Override
    public JPanel createWorkArea(JPanel containerPanel, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new InsuranceClaimsManagerWorkAreaJPanel(containerPanel, account, organization, enterprise, business);//To change body of generated methods, choose Tools | Templates.
    }
    
}
