/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.constants;

/**
 *
 * @author Anjali
 */
public class WorkRequestStatus {
     
    public enum Status{
        CREATED("CREATED"),
        IN_PROGRESS("IN PROGRESS"),
        APPROVED("APPROVED"),
        DENIED("DENIED"),
        IN_EXTERNAL_NETWORK_PROGRESS("PROGRESS WITH EXTERNAL"),
        SENT_TO_INSURANCE("SENT TO INSURANCE"),
        SENT_TO_PHARMACY("SENT TO PHARMACY"),
        TREATMENT_COMPLETE("TREATMENT COMPLETE"),
        COMPLETED("COMPLETED");
        
        private String value;
        private Status(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        @Override
        public String toString() {
            return value;
        }
    }
    
}
