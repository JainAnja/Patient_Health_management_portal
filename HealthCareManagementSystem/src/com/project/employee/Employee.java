/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.employee;

import com.project.person.Person;

/**
 *
 * @author Anjali
 */
public class Employee extends Person{
    
    private int id;
    private static int count = 1;

    public Employee() {
        super();
        id =++ count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
