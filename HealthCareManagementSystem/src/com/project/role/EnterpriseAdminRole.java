/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.role;

import com.project.ecosystem.Ecosystem;
import com.project.enterprise.Enterprise;
import com.project.organization.Organization;
import com.project.ui.entadmin.EntAdminWorkAreaJpanel;
import com.project.useraccount.UserAccount;
import javax.lang.model.SourceVersion;
import javax.swing.JPanel;

/**
 *
 * @author bhavinbhatia
 */
public class EnterpriseAdminRole extends Role {

    public EnterpriseAdminRole() {
        super(Role.RoleType.ENTERPRISEADMIN);
    }
    
    @Override
    public JPanel createWorkArea(JPanel containerPanel, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new EntAdminWorkAreaJpanel(containerPanel, account, enterprise);//To change body of generated methods, choose Tools | Templates.
    }    
}