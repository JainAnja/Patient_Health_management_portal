/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.enterprise;

import com.project.bloodbank.BloodBankEnterprise;
import com.project.healthcare.HospitalSystemEnterprise;
import com.project.insurance.InsuranceEnterprise;
import com.project.organization.Organization;
import com.project.organization.OrganizationDirectory;
import com.project.ui.pharmacy.PharmacyEnterprise;
import com.project.useraccount.UserAccount;

/**
 *
 * @author Anjali
 */
public abstract class Enterprise extends Organization {

    private int enterpriseId;
    private String enterpriseName;
    private EnterpriseType enterpriseType;
    private static int count = 0;
    private OrganizationDirectory organizationDirectory;

    public Enterprise(String name, EnterpriseType type) {
        super(name, Organization.Type.ADMIN.getValue());
        this.enterpriseName = name;
        this.enterpriseType = type;
        this.enterpriseId = ++count;
        this.organizationDirectory = new OrganizationDirectory();
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public enum EnterpriseType {

        HospitalSystemEnterprise("Hospital"),
        PharmacyEnterprise("Pharmacy"),
        BloodBankEnterprise("BloodBank"),
        InsuranceEnterprise("Insurance");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;

        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString()
        {
            return value;
        }

        public static EnterpriseType fromString(String input) {
            for(EnterpriseType et : EnterpriseType.values()) {
                if(et.getValue().equalsIgnoreCase(input)) 
                    return et;
            }
            
            return null;
        }
    }
    
    
    
    public UserAccount authenticateUserAcrossAllEntOrgs(String userName, String password) {
        UserAccount ua = this.getUserAccountDirectory().authenticateUser(userName, password);
        if(ua!= null) {
            return ua;
        }
        
        for(Organization org : this.organizationDirectory.getOrganizationList()) {
            ua = org.getUserAccountDirectory().authenticateUser(userName, password);
            if(ua!= null)
                return ua;
        }
        
        return null;
        
    }

}
