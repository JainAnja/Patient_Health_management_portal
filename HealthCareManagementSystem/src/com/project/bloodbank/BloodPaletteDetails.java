/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.bloodbank;


import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author stutisingh
 */
public class BloodPaletteDetails {
    
    private Blood bloodUnit;
    private int countUnitOfBlood;
    private LocalDate lastStockedDate;

    public BloodPaletteDetails(Blood bloodUnit, int countUnitOfBlood, LocalDate stockInDate) {
        this.countUnitOfBlood = countUnitOfBlood;
        this.bloodUnit = bloodUnit;
        this.lastStockedDate = stockInDate;
    }

    public Blood getBloodUnit() {
        return bloodUnit;
    }

    public void setBloodUnit(Blood bloodUnit) {
        this.bloodUnit = bloodUnit;
    }
    
    public int getcountUnitOfBlood() {
        return countUnitOfBlood;
    }

    public void setcountUnitOfBlood(int countUnitOfBlood) {
        this.countUnitOfBlood = countUnitOfBlood;
    }

    public LocalDate getLastStockedDate() {
        return lastStockedDate;
    }

    public void setLastStockedDate(LocalDate lastStockedDate) {
        this.lastStockedDate = lastStockedDate;
    }

    @Override
    public String toString() {
        return bloodUnit.getBloodType().getValue();
    }
    
    
    
    
}
