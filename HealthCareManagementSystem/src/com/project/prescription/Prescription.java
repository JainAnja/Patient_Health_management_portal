/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.prescription;

/**
 *
 * @author bhavinbhatia
 */
public class Prescription {
    private int docRefNo;
    private int patientId;
    private int hospitalId;
    private String medicinePrescribed;
    private String policyNumber;

    public Prescription() {
    }

    public Prescription(int docRefNo, int patientId,  int hospitalId,  String medicinePrescribed, String policyNumber) {
        this.docRefNo = docRefNo;
        this.patientId = patientId;
        this.hospitalId = hospitalId;
        this.medicinePrescribed = medicinePrescribed;
        this.policyNumber = policyNumber;
    }
       

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getDocRefNo() {
        return docRefNo;
    }

    public void setDocRefNo(int docRefNo) {
        this.docRefNo = docRefNo;
    }
   

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
  
    public String getMedicinePrescribed() {
        return medicinePrescribed;
    }

    public void setMedicinePrescribed(String medicinePrescribed) {
        this.medicinePrescribed = medicinePrescribed;
    }
    
   @Override
   public  String toString(){
       return this.medicinePrescribed.toString();
   }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
   
   
    
}