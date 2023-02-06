/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.workqueue;

import com.project.patient.Encounter;
import com.project.patient.PatientProfile;
import com.project.prescription.Prescription;
import com.project.useraccount.UserAccount;

/**
 *
 * @author bhavinbhatia
 */
public class InsuranceClaimWorkRequest extends WorkRequest{
    PatientProfile patient;
    Prescription prescription;
    Encounter encounter;

    public InsuranceClaimWorkRequest(UserAccount sender, UserAccount receiver, String message,PatientProfile patient) {
        super(sender, receiver, message);
        this.patient = patient; 
        this.prescription = new Prescription();
    }

    public PatientProfile getPatient() {
        return patient;
    }

    public void setPatient(PatientProfile patient) {
        this.patient = patient;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public String toString() {
        return patient.getPatientName();
    }
     
    
    
}
