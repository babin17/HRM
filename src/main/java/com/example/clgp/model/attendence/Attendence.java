package com.example.clgp.model.attendence;

import javax.persistence.*;


@Entity
@Table(name= "attendance")
public class Attendence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // all date except sat and su
    private String date;
    private String inTime;
    private String outTime;
    private String day;
    private String status;


    public Attendence(){}
    public Attendence(String date, String inTime, String outTime, String day, String status){
        this.date = date;
        this.inTime = inTime;
        this.outTime = outTime;
        this.day = day;
        this.status = status;
    }


    public Long getID(){
        return this.id;
    }

    public String getDate(){
        return this.date;
    }

    public String getInTime(){
        return this.inTime;
    }

    public String getOutTime(){
        return this.outTime;
    }

    public String getDay(){
        return this.day;
    }

    public String getStatus(){
        return this.status;
    }
}
