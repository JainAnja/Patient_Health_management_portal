/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.organization;

import com.project.bloodbank.BloodInventoryOrganization;
//import com.project.bloodbank.BloodSupplyOrganization;
import com.project.healthcare.PatientOrganization;
import com.project.healthcare.AdminOrganization;
import com.project.healthcare.DoctorOrganization;
import com.project.healthcare.DonorOrganization;
import com.project.healthcare.LaboratoryOrganization;
import com.project.healthcare.NurseOrganization;
import com.project.insurance.InsuranceClaimsOrganization;
import com.project.organization.Organization.Type;
import com.project.ui.pharmacy.*;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class OrganizationDirectory {
    
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        this.organizationList = new ArrayList<>();
    }
    
    

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    
    public Organization createOrganization(String name,Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.ADMIN.getValue())){
            organization = new AdminOrganization(name);
            organizationList.add(organization);
        }
    
        else if (type.getValue().equals(Type.DOCTOR.getValue())){
            organization = new DoctorOrganization(name);
            organizationList.add(organization);
              
        }
        
        else if (type.getValue().equals(Type.NURSE.getValue())){
            organization = new NurseOrganization(name);
            organizationList.add(organization);      
        }
        
        else if (type.getValue().equals(Type.PATIENT.getValue())){
            organization = new PatientOrganization(name);
            organizationList.add(organization);      
        }

        else if (type.getValue().equals(Type.PHARMACY.getValue())){
            organization = new PharmacyOperationOrganization(name, type.getValue());
            organizationList.add(organization);      
        }
        
        else if (type.getValue().equals(Type.INSURANCE.getValue())){
            organization = new InsuranceClaimsOrganization(name, type.getValue());
            organizationList.add(organization);      
        }
        else if (type.getValue().equals(Type.LABORATORY.getValue())){
            organization = new LaboratoryOrganization(name);
            organizationList.add(organization);      
        }
        else if (type.getValue().equals(Type.DONOR.getValue())){
            organization = new DonorOrganization(name);
            organizationList.add(organization);      
        }
       
        else if (type.getValue().equals(Type.BLOODBANKINVENTORY.getValue())){
            organization = new BloodInventoryOrganization(name);
            organizationList.add(organization);      
        }
//        else if (type.getValue().equals(Type.BLOODBANKSUPPLY.getValue())){
//            organization = new BloodSupplyOrganization(name);
//            organizationList.add(organization);      
//        }
//        
        
        
        
        else if (type.getValue().equals(Type.PHARMACY.getValue())){
            organization = new PharmacyOperationOrganization(name, type.getValue());
            organizationList.add(organization);      
        }
        
        else if (type.getValue().equals(Type.INSURANCE.getValue())){
            organization = new InsuranceClaimsOrganization(name, type.getValue());
            organizationList.add(organization);      
        }
        
            return organization;    
    }
    
    
    public boolean checkifUserNameisPresent(String emailId)
    {
        for(Organization organization:organizationList)
        {
            if(organization.checkifUserNameisPresent(emailId))
                return true;
    
        }
        
        
    return false;
    }
    
    
}
        
