/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.healthcare;

import com.project.bloodbank.BloodBankEnterprise;
import com.project.enterprise.Enterprise;
import com.project.insurance.InsuranceEnterprise;
import com.project.ui.pharmacy.PharmacyEnterprise;
import com.project.role.Role;
import java.util.ArrayList;


/**
 *
 * @author Anjali
 */
public class HospitalSystemEnterprise extends Enterprise{
    
    private ArrayList<Enterprise> associatedEnterprise;

    public HospitalSystemEnterprise(String name, EnterpriseType type) {
        super(name, type);
        this.associatedEnterprise = new ArrayList<>();
    }

    public ArrayList<Enterprise> getAssociatedEnterprise() {
        return associatedEnterprise;
    }

    public void setAssociatedEnterprise(ArrayList<Enterprise> associatedEnterprise) {
        this.associatedEnterprise = associatedEnterprise;
    }
    
    
     
    public Enterprise addAssociatedEnterprise(String name,Enterprise.EnterpriseType type)
    {
        Enterprise enterprise = null;
            if(type == EnterpriseType.BloodBankEnterprise)
        {
            enterprise = new BloodBankEnterprise(name,type);
        associatedEnterprise.add(enterprise);
        
        }
        
        if(type == EnterpriseType.PharmacyEnterprise)
        {
            enterprise = new PharmacyEnterprise(name,type);
        associatedEnterprise.add(enterprise);
        }
        
        
        if(type == EnterpriseType.InsuranceEnterprise)
        {
            enterprise = new InsuranceEnterprise(name,type);
        associatedEnterprise.add(enterprise);
      
        }
        
        return enterprise;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
