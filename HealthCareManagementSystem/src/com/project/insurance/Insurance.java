/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.insurance;

import com.project.patient.PatientProfile;
import com.project.prescription.Prescription;

/**
 *
 * @author bhavinbhatia
 */
public class Insurance {
    private String policyNumber;
    PatientProfile selectedPatientProfile;
    Prescription prescription;

    public Insurance() {
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public PatientProfile getSelectedPatientProfile() {
        return selectedPatientProfile;
    }

    public void setSelectedPatientProfile(PatientProfile selectedPatientProfile) {
        this.selectedPatientProfile = selectedPatientProfile;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
    
    
    
}
