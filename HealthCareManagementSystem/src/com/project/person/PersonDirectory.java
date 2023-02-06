/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.person;

import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class PersonDirectory {
      
    ArrayList<Person> personList;

    public PersonDirectory() {
        this.personList = new ArrayList<>();
    }
    
    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
     
}
