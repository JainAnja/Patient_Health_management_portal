package com.project.workqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anjali
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workrequest;

    public WorkQueue() {
        this.workrequest = new ArrayList<>();
        Collections.sort(workrequest, new Comparator<WorkRequest>() {
            @Override
            public int compare(WorkRequest o1, WorkRequest o2) {
                return o1.getStatus().compareTo(o2.getStatus());
            }
            
        });
    }
   
    public ArrayList<WorkRequest> getWorkrequest() {
        return workrequest;
    }

    public void setWorkrequest(ArrayList<WorkRequest> workrequest) {
        this.workrequest = workrequest;
    }
    
    
}
