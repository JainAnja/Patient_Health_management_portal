/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.workqueue;

import com.project.donor.DonorProfile;
import com.project.person.Person;
import com.project.useraccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Anjali
 */
public class LabAssistantProcessingWorkRequest extends WorkRequest{
    
    private Person id;
    private DonorProfile donor;
    private Person receptionist;
    private String lastVisitedDate;
    

    public LabAssistantProcessingWorkRequest(UserAccount sender, UserAccount receiver, String message, DonorProfile donor) {
        super(sender, receiver, message);
        this.donor = donor;
    }

    public Person getId() {
        return id;
    }

    public void setId(Person id) {
        this.id = id;
    }

    public DonorProfile getDoner() {
        return donor;
    }

    public void setDoner(DonorProfile doner) {
        this.donor = doner;
    }

    public Person getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Person receptionist) {
        this.receptionist = receptionist;
    }

    public String getLastVisitedDate() {
        if(donor.getBloodDonationHistory().size() > 0) {
            return donor.getBloodDonationHistory().get(donor.getBloodDonationHistory().size()-1);
        }
        return "Not visited yet";
    }

    public void setLastVisitedDate(String lastVisitedDate) {
        this.lastVisitedDate = lastVisitedDate;
    }

    @Override
    public String toString() {
        return donor.getfName() + donor.getlName();
    }
     
}
