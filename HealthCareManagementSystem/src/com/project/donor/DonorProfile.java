/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.donor;

import com.project.patient.EncounterHistory;
import com.project.person.Person;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class DonorProfile extends Person {
    
    private ArrayList<String> bloodDonationHistory;

    public DonorProfile() {
        this.bloodDonationHistory = new ArrayList<>();
    }
     
    public ArrayList<String> getBloodDonationHistory() {
        return bloodDonationHistory;
    }

    public void setBloodDonationHistory(ArrayList<String> bloodDonationHistory) {
        this.bloodDonationHistory = bloodDonationHistory;
    }

    @Override
    public String toString() {
        return this.getfName() + this.getlName();
    }
    
    
    
    
    
    
}
