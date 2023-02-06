/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.ecosystem;

import com.project.location.Country;
import com.project.organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class Business {
    
    private static Business business;
    private OrganizationDirectory organizationDirectory;
    private Ecosystem systemorg;
   
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public Ecosystem getSystemorg() {
        return systemorg;
    }

    public void setSystemorg(Ecosystem systemorg) {
        this.systemorg = systemorg;
    }
    
    private Business() {
        this.organizationDirectory = new OrganizationDirectory();
    }

    public static Business getInstance(){
        if (business == null){
            business = new Business();
        }
        return business;
    }

    public static Business getBusiness() {
        return business;
    }

    public static void setBusiness(Business business) {
        Business.business = business;
    }


    
    
}


