package com.project.patient;

import java.time.LocalDate;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anjali and bhavin
 */
public class EncounterHistory {
    ArrayList<Encounter> encounters;

    public EncounterHistory() {
      this.encounters = new ArrayList<>();
    }

    public EncounterHistory(ArrayList<Encounter> encounters) {
        this.encounters = encounters;
    }

    public ArrayList<Encounter> getEncounters() {
        return encounters;
    }

    public void setEncounters(ArrayList<Encounter> encounters) {
        this.encounters = encounters;
    }
    
    public Encounter addNewEncounter (Encounter newEncounter){
        encounters.add(newEncounter);
        return newEncounter;
    }
    
    public void deleteEncounter (Encounter encounter){
        encounters.remove(encounter);
    }
    
    public void isLatestEncounterAbnormal(boolean isAbnormal){
        
    }
    
    
    
    
}