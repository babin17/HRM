package com.example.hrmdl;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
    @Id
    private String id;
    private String username;
    private String email;
    private String address;
    private String contact;
    private String password;


    private User(String id, String username, String email, String address, String contact, String password){
        this.id = id;
        this.username = username;
        this.email = email;
        this.address = address;
        this.contact = contact;
        this.password = password;
    }

    
    public User(String username, String email, String address, String contact, String password){
        this(UUID.randomUUID().toString(), username, email, address, contact, password);
    }

    public String getID(){
        return id;
    }

    public String getUsername(){
        return username;
    }


    public String getEmail(){
        return email;
    }

    public String getAddress(){
        return address;
    }


    public String getContact(){
        return contact;
    }   

    public String getPassword(){
        return password;
    }

    public void setID(String id){
        this.id = id;
    }



    public void setUsername(String username){
        this.username = username;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setContact(String contact){
        this.contact = contact;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
