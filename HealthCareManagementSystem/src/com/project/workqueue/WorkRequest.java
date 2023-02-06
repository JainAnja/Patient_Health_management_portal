/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.workqueue;

import com.project.constants.WorkRequestStatus;
import java.util.Date;
import com.project.useraccount.UserAccount;

/**
 *
 * @author Anjali
 */
public abstract class WorkRequest {
     
    private static int count =0;
    private int requestId;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status; // value from this is coming from WorkRequestStatus enum
    private Date requestDate;
    private Date resolveDate;

    public WorkRequest(UserAccount sender, UserAccount receiver, String message) {
        this.requestId = ++count;
        this.status = WorkRequestStatus.Status.CREATED.getValue();
        this.requestDate = new Date();
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }
 
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        WorkRequest.count = count;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }   
}
