/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.healthcare;

import com.project.bloodbank.Blood;
import com.project.bloodbank.BloodPaletteDetails;
import com.project.organization.Organization;
import com.project.role.LabAssistantRole;
import com.project.role.Role;
import com.project.utils.Utils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Anjali
 */
public class LaboratoryOrganization extends Organization {
    
    private ArrayList<LabAssistantRole> labAssistantList;
    private ArrayList<BloodPaletteDetails> bloodInventory;
    
    
    public LaboratoryOrganization(String name) {
        super(name, Organization.Type.LABORATORY.getValue());
        this.labAssistantList = new ArrayList<>();
        this.bloodInventory = new ArrayList<>();
        populateBloodInventory();
    }
    
    
    public void populateBloodInventory() {

        //TODO add random date generator
        String[] bloodTypes = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
        for(String bloodType : bloodTypes) {
                 Blood blood = new Blood(Blood.BloodType.getBloodTypeFromString(bloodType), new Random().nextDouble()*100);
                 BloodPaletteDetails bpd = new BloodPaletteDetails(blood, new Random().nextInt(10), Utils.getRandomDate());
                 bloodInventory.add(bpd);
             }   
     }

    public ArrayList<BloodPaletteDetails> getBloodInventory() {
        return bloodInventory;
    }

    public void setBloodInventory(ArrayList<BloodPaletteDetails> bloodInventory) {
        this.bloodInventory = bloodInventory;
    }
    
    public ArrayList<LabAssistantRole> getLabAssistantList() {
        return labAssistantList;
    }

    public void setLabAssistantList(ArrayList<LabAssistantRole> labAssistantList) {
        this.labAssistantList = labAssistantList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. //To change body of generated methods, choose Tools | Templates.
    }   
    
}
