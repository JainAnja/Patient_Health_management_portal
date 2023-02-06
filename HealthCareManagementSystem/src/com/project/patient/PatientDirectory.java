/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.patient;

import java.util.ArrayList;


/**
 *
 * @author bhavinbhatia
 */
public class PatientDirectory {

    private ArrayList<PatientProfile> patients;

    public PatientDirectory() {
        patients = new ArrayList<>();
    }

    public ArrayList<PatientProfile> getPatientCatalog() {
        return patients;
    }

    public void setPatientCatalog(ArrayList<PatientProfile> patientCatalog) {
        this.patients = patientCatalog;
    }

    public PatientProfile addPatient(PatientProfile patient){
        patients.add(patient);
        return patient;
    }
}
