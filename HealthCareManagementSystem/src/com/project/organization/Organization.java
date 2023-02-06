/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.organization;

import com.project.employee.EmployeeDirectory;
import com.project.enterprise.Enterprise;
import com.project.healthcare.HospitalSystemEnterprise;
import com.project.workqueue.WorkQueue;
import com.project.person.PersonDirectory;
import com.project.role.Role;
import com.project.useraccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public abstract class Organization {
    
    private String name;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private String OrganizationType;
    private int organizationID;
    private static int count;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;

    public Organization(String name, String organizationType) {
        this.name = name;
        this.OrganizationType = organizationType;
        this.personDirectory = new PersonDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        this.workQueue = new WorkQueue();
        this.organizationID = ++count;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public String getOrganizationType() {
        return OrganizationType;
    }

    public void setOrganizationType(String OrganizationType) {
        this.OrganizationType = OrganizationType;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Organization.count = count;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    public enum Type{
        ADMIN("Admin Organization"), 
        DOCTOR("Doctor Organization"),
        PATIENT("Patient Organization"),
        PHARMACY("Pharmacy Organization"),
        INSURANCE("Insurance Organization"),
        NURSE("Nurse Organization"),
        LABORATORY("Laboratory Organization"),
        DONOR("Donor Organization"),
        BLOODBANKINVENTORY("BloodBank Inventory Organization"),
        BLOODBANKSUPPLY("BloodBank Supply Organization");
         
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        public static Type fromString(String input) {
            for(Type et : Type.values()) {
                if(et.getValue().equalsIgnoreCase(input))
                    return et;
            }

            return null;
        }
    }

    @Override
    public String toString() {
        return  name;
    }
    
    public boolean checkifUserNameisPresent(String emailId){
        return(userAccountDirectory.checkifUsernameisPresent(emailId));
    }    

}
