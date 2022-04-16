package com.example.clgp.model.admin;

import javax.persistence.*;

// define persistence java class
@Entity

// provides table with this mapper
@Table(name="admin")

public class Admin {
    // primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String contact;

    private Admin(){}


    public Admin(String firstName, String lastName, String username, String contact){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.contact = contact;
    }


    public Long getID(){
        return this.id;
    } 

    public String getUsername(){
        return username;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getContact(){
        return contact;
    }
}