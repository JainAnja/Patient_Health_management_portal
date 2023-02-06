/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.ui.pharmacy;

/**
 *
 * @author bhavinbhatia
 */
public class Medicine {
    
    String medName;
    int medId;
    int medQuantity;
    int medPrice;

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public int getMedId() {
        return medId;
    }

    public void setMedId(int medId) {
        this.medId = medId;
    }

    public int getMedQuantity() {
        return medQuantity;
    }

    public void setMedQuantity(int medQuantity) {
        this.medQuantity = medQuantity;
    }

    public int getMedPrice() {
        return medPrice;
    }

    public void setMedPrice(int medPrice) {
        this.medPrice = medPrice;
    }

    public Medicine(String medName, int medId, int medQuantity, int medPrice) {
        this.medName = medName;
        this.medId = medId;
        this.medQuantity = medQuantity;
        this.medPrice = medPrice;
    }
    
    
}
