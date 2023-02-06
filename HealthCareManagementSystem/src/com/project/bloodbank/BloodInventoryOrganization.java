/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.bloodbank;

import java.util.ArrayList;
import java.util.Date;
import com.project.bloodbank.BloodPaletteDetails;
import com.project.organization.Organization;
import com.project.role.Role;
import com.project.utils.Utils;
import static com.project.utils.Utils.getRandomDate;
import java.util.Random;

/**
 *
 * @author stutisingh
 */
public class BloodInventoryOrganization extends Organization {
    
    private ArrayList<BloodPaletteDetails> bloodPaletteDetails;

    public BloodInventoryOrganization(String name) {
        super(name, Organization.Type.BLOODBANKINVENTORY.getValue());
        this.bloodPaletteDetails = new ArrayList<>();
        populateBloodInventory();
    }

    public ArrayList<BloodPaletteDetails> getBloodPaletteList() {
        return bloodPaletteDetails;
    }

    public void setBloodPaletteList(ArrayList<BloodPaletteDetails> bloodPaletteDetails) {
        this.bloodPaletteDetails = bloodPaletteDetails;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addBloodPaletteItem (BloodPaletteDetails bpd) {
        bloodPaletteDetails.add(bpd);
      
    }
    
    public void deleteBloodPaletteItem (BloodPaletteDetails bpd){
        bloodPaletteDetails.remove(bpd);
        }
    
    
    
    public void populateBloodInventory() {

        //TODO add random date generator
        String[] bloodTypes = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
        for(String bloodType : bloodTypes) {
                 Blood blood = new Blood(Blood.BloodType.getBloodTypeFromString(bloodType), new Random().nextDouble()*100);
                 BloodPaletteDetails bpd = new BloodPaletteDetails(blood, new Random().nextInt(10), Utils.getRandomDate());
                 bloodPaletteDetails.add(bpd);
             }   
         }
     }

    
    
    
    

