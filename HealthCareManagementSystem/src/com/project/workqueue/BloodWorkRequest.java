/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.workqueue;

import com.project.bloodbank.Blood.BloodType;
import com.project.useraccount.UserAccount;

/**
 *
 * @author stutisingh
 */
public class BloodWorkRequest extends WorkRequest{
    
    BloodType bloodType;
    int bloodUnitCount;
    
    public BloodWorkRequest (UserAccount sender, UserAccount receiver, String message, BloodType bloodType, int bloodUnitCount){
        super(sender, receiver, message);
        this.bloodType = bloodType;
        this.bloodUnitCount = bloodUnitCount;
    }
    
    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public int getBloodUnitCount() {
        return bloodUnitCount;
    }

    public void setBloodUnitCount(int bloodUnitCount) {
        this.bloodUnitCount = bloodUnitCount;
    }

    @Override
    public String toString() {
        return bloodType.getValue();
    }   
    
}
