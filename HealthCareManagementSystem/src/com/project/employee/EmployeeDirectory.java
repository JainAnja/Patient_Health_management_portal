/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.employee;

import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employessList;

    public EmployeeDirectory() {
        this.employessList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployessList() {
        return employessList;
    }

    public void setEmployessList(ArrayList<Employee> employessList) {
        this.employessList = employessList;
    }
    
    
    public Employee addNewEMployee(String name){
        Employee employee = new Employee();
        employee.setEmailId(name);
        employessList.add(employee);
        return employee;
        
    }
    
    
    
}
