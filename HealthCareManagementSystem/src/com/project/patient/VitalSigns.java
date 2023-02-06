package com.project.patient;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Anjali
 */
public class VitalSigns {

    String symptom;
    int bloodPressure;
    int heartRate;
    int temperature;
    String allergy;
    Encounter encounter;

    public VitalSigns(String symptom, int bloodPressure, int heartRate, int temperature, String allergy, Encounter encounter) {
        this.symptom = symptom;
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.temperature = temperature;
        this.allergy = allergy;
        this.encounter = encounter;
    }
    
     public VitalSigns( int bloodPressure, int heartRate, int temperature ) {
        this.symptom = symptom;
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.temperature = temperature;
        this.encounter = encounter;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public String toString() {
        return  "Blood Pressure: " + bloodPressure + ", Heart Rate:" + heartRate + ", Temperature:" + temperature ;
    }
    
    
    

}
