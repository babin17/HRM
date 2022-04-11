package com.example.hrmdl;

import java.util.UUID;

public class Attendence {
    private final String id;
    private String employeeID;
    private String date;
    private String checkin_time;
    private String checkout_time;

    private Attendence(String id, String employeeID, String date, String checkin, String checkout){
        this.id = id;
        this.employeeID = employeeID;
        this.date = date;
        this.checkin_time = checkin;
        this.checkout_time = checkout;
    }

    public Attendence(String employeeId, String date, String checkin, String checkout){
        this(UUID.randomUUID().toString(), employeeId, date, checkin, checkout);
    }


    public String getID(){
        return id;
    }

    public String getEmployeeID(){
        return employeeID;
    }

    public String getDate(){
        return date;
    }

    public String checkInTime(){
        return checkin_time;
    }

    public String checkOutTime(){
        return checkout_time;
    }



    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setCheckinTime(String checkin){
        this.checkin_time = checkin;
    }

    public void setCheckOutTime(String checkout){
        this.checkout_time = checkout;
    }
}
