/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.patient;

import com.project.patient.EncounterHistory;
import com.project.person.Person;
import java.nio.charset.Charset;
import java.util.Random;

/**
 *
 * @author bhavinbhatia
 */
public class PatientProfile extends Person {

    private String patientName;
    private int age;
    private String gender;
    private String insuranceNumber;
    private String insuranceGroup;
    static int count;
    private int patientId;
    private EncounterHistory encounterHistory;

    public PatientProfile() {
        super();
        this.encounterHistory = new EncounterHistory();
        this.count = count + 1;
        this.insuranceNumber = generateInsuranceNumber();
        this.patientId = count;

    }

    public PatientProfile(String patientName, int age, String gender, String insuranceNumber) {
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.insuranceNumber = insuranceNumber;
        this.count = count + 1;
        this.encounterHistory = new EncounterHistory();

        this.patientId = count;

    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getPatientName() {
        return this.getfName() + " " + this.getlName();
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public String getInsuranceGroup() {
        return insuranceGroup;
    }

    public void setInsuranceGroup(String insuranceGroup) {
        this.insuranceGroup = insuranceGroup;
    }

    @Override
    public String toString() {
        return getfName() + " " + getlName();
    }

    public String generateInsuranceNumber() {
        int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();

    String generatedString = random.ints(leftLimit, rightLimit + 1)
      .limit(targetStringLength)
      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
      .toString();
    
    System.out.println("Insurance number : " + generatedString);
    
    return generatedString;
    }

}
