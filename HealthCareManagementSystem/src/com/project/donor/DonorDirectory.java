/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.donor;

import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class DonorDirectory {
    
    private ArrayList<DonorProfile> donorList;

    public DonorDirectory(ArrayList<DonorProfile> donorList) {
        this.donorList = new ArrayList<>();
    }

    public ArrayList<DonorProfile> getDonorList() {
        return donorList;
    }

    public void setDonorList(ArrayList<DonorProfile> donorList) {
        this.donorList = donorList;
    }
    
    
}
