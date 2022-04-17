package com.example.clgp.model.department;

import javax.persistence.*;


@Entity
@Table(name= "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String shortName;
    private String description;
    private String manager;
    private int maxWorkers;
    private int departmentNumber;

    public Department(){}
    public Department(String name, String shortName, String description, String manager, int max_workers, int num){
        this.name = name;
        this.shortName = shortName;
        this.description = description;
        this.manager = manager;
        this.maxWorkers = max_workers;
        this.departmentNumber = num;
    }


    public Long getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getShortName(){
        return this.shortName;
    }

    public String getDescription(){
        return this.description;
    }

    public String getManager(){
        return this.manager;
    }

    public int getMaxWorker(){
        return this.maxWorkers;
    }

    public int getDepartmentNumber(){
        return this.departmentNumber;
    }
}
