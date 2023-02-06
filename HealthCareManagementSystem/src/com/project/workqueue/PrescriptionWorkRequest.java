/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.workqueue;

import com.project.patient.Encounter;
import com.project.prescription.Prescription;
import com.project.patient.PatientProfile;
import com.project.useraccount.UserAccount;

/**
 *
 * @author bhavinbhatia
 */
public class PrescriptionWorkRequest extends WorkRequest {

    PatientProfile patient;
    Prescription prescription;
    Encounter encounter;

    public PrescriptionWorkRequest(UserAccount sender, UserAccount receiver, String message, PatientProfile patient) {
        super(sender, receiver, message);
        this.patient = patient;      
        this.prescription = new Prescription();

    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public PatientProfile getPatient() {
        return patient;
    }

    public void setPatients(PatientProfile patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return patient.getfName() + " " + patient.getlName();
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }
    
    
}
