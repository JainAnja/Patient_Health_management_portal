/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.workqueue;

import com.project.patient.Encounter;
import com.project.patient.PatientProfile;
import com.project.person.Person;
import com.project.useraccount.UserAccount;
/**
 *
 * @author bhavinbhatia
 */
public class NurseProcessingWorkRequest extends WorkRequest {
    
    
    private PatientProfile patient;
    private Person receptionist;
    private String notes;
    private int criticality;
    
    
    public NurseProcessingWorkRequest(UserAccount sender, UserAccount receiver, String message, PatientProfile patient) {
        super(sender, receiver, message);
        this.patient = patient;
        this.criticality = 3; // Least critical 
        this.notes = message;
    }

    public PatientProfile getPatient() {
        return patient;
    }

    public void setPatient(PatientProfile patient) {
        this.patient = patient;
    }

    public Person getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Person receptionist) {
        this.receptionist = receptionist;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getCriticality() {
        return criticality;
    }

    public void setCriticality(int criticality) {
        this.criticality = criticality;
    }

    @Override
    public String toString() {
        return  patient.getfName() + " " + patient.getlName();
    }   
}
