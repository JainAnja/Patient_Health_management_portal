package com.project.bloodbank;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stutisingh
 */
public class Blood {
    
    private BloodType bloodType;
    private Double unitPrice;
    
    
    
    public Blood(BloodType bloodType, Double unitPrice) {
        this.bloodType = bloodType;
        this.unitPrice = unitPrice;
        
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
//    public int getUnitCount(){
//        return unitCount;
//        
//    }
//    public void setUnitCount(int unitCount) {
//        this.unitCount = unitCount;
//    }
    



public enum BloodType{
        
    Apositive("A+"),
    Anegative("A-"),
    Bpositive("B+"),
    Bnegative("B-"),
    Opositive("O+"),
    Onegative("O-"),
    ABpositive("AB+"),
    ABnegative("AB-");
    
        private String value;
        
        private BloodType(String value)
        {
            this.value=value;
        
        
    }
        
        public String getValue()
        {
            return value;
        }
        
        public static BloodType getBloodTypeFromString(String input) {
            for(BloodType type : BloodType.values()) {
                if(type.getValue().equalsIgnoreCase(input)) {
                    return type;
                }
            }
            return null;
        }
    
    }

    @Override
    public String toString() {
        return "Blood{" + "bloodType=" + bloodType + ", unitPrice=" + unitPrice + '}';
    }


    

}
