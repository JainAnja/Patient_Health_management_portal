package com.project.patient;

import java.time.LocalDate;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anjali
 */
public class Encounter {
    
    VitalSigns vitalSigns;
    private LocalDate date;
    double payment;
    EncounterHistory encounterHistory;
    double insuranceAmount;
    double hospitalAmount;
    double pharmacyAmount;
    String notes;
    String medication;
    
    public Encounter(LocalDate date, VitalSigns vitalSigns) {
        this.date = date;
        this.vitalSigns = vitalSigns;       
    }
   
    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return " " + date;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public double getHospitalAmount() {
        return hospitalAmount;
    }

    public void setHospitalAmount(double hospitalAmount) {
        this.hospitalAmount = hospitalAmount;
    }

    public double getPharmacyAmount() {
        return pharmacyAmount;
    }

    public void setPharmacyAmount(double pharmacyAmount) {
        this.pharmacyAmount = pharmacyAmount;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    } 

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }
    
}
