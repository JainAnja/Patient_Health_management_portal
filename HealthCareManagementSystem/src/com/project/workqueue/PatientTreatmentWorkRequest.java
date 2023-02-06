/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.workqueue;

import com.project.patient.Encounter;
import com.project.patient.PatientProfile;
import com.project.person.Person;
import com.project.useraccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author bhavinbhatia
 */
public class PatientTreatmentWorkRequest extends WorkRequest {

    String symptomps;
    String medications;
    String allergies;
    PatientProfile patient;
    Encounter encounter;
    
    public PatientTreatmentWorkRequest(UserAccount sender, UserAccount receiver, String message, PatientProfile patient) {
        super(sender, receiver, message);
        this.patient = patient;
    }

    public String getSymptomps() {
        return symptomps;
    }

    public void setSymptomps(String symptomps) {
        this.symptomps = symptomps;
    }

    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
        encounter.setMedication(medications);
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public PatientProfile getPatient() {
        return patient;
    }

    public void setPatient(PatientProfile patient) {
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
