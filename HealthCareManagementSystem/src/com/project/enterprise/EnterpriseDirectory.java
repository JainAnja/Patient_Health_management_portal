/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.enterprise;

import com.project.bloodbank.BloodBankEnterprise;
import com.project.enterprise.Enterprise.EnterpriseType;
import com.project.healthcare.HospitalSystemEnterprise;
import com.project.insurance.InsuranceEnterprise;
import com.project.organization.Organization;
import com.project.ui.pharmacy.PharmacyEnterprise;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        this.enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public Enterprise addNewEnterprise(String name, EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == EnterpriseType.HospitalSystemEnterprise) {
            enterprise = new HospitalSystemEnterprise(name, type);
            enterpriseList.add(enterprise);

        }

        if (type == EnterpriseType.BloodBankEnterprise) {
            enterprise = new BloodBankEnterprise(name, type);
            enterpriseList.add(enterprise);
        }

        if (type == EnterpriseType.InsuranceEnterprise) {
            enterprise = new InsuranceEnterprise(name, type);
            enterpriseList.add(enterprise);

        }

        if (type == EnterpriseType.PharmacyEnterprise) {
            enterprise = new PharmacyEnterprise(name, type);
            enterpriseList.add(enterprise);
            return enterprise;
        }

        return enterprise;
    }
    
    
    public boolean checkUserNamePresent(String emailId)
    {
        for(Enterprise enterprise:enterpriseList)
        {
            if(enterprise.getUserAccountDirectory().checkifUsernameisPresent(emailId))
                return true;
        }
        
        for(Enterprise enterprise:enterpriseList)
        {
            for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(organization.getUserAccountDirectory().checkifUsernameisPresent(emailId))
                    return true;
            }
        }
        return false;
    }

}
