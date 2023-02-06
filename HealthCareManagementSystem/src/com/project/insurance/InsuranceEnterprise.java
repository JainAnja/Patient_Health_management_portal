/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.insurance;

import com.project.enterprise.Enterprise;
import com.project.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class InsuranceEnterprise extends Enterprise{

    public InsuranceEnterprise(String name, EnterpriseType type) {
        super(name, type);
    } 

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
