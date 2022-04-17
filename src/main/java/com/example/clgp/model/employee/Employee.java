package com.example.clgp.model.employee;

import javax.persistence.*;

@Entity
@Table(name= "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String username;
    private String department;
    private String role;
    private String contact;
    private String address;

    public Employee(){}

    public Employee(String firstName, String lastName, String username, String department, String role, String contact, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.department = department;
        this.role = role;
        this.contact = contact;
        this.address = address;
    }


    public Long getID(){
        return this.id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getUsername(){
        return this.username;
    }

    public String getDepartment(){
        return this.department;
    }

    public String getRole(){
        return this.role;
    }

    public String getContact(){
        return this.contact;
    }

    public String getAddress(){
        return this.address;
    }
}
