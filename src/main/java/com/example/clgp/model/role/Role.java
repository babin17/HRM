package com.example.clgp.model.role;

import javax.persistence.*;


@Entity
@Table(name= "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String jobTitle;
    private String joinedDate;
    private String yearOfExperience;


    public Role(){}
    public Role(String jobTitle, String joinedDate, String yearOfExperience){
        this.jobTitle = jobTitle;
        this.joinedDate = joinedDate;
        this.yearOfExperience = yearOfExperience;
    }


    public Long getID(){
        return this.id;
    }

    public String getJobTitle(){
        return this.jobTitle;
    }

    public String getJoinedDate(){
        return this.joinedDate;
    }
    
    public String getYearOfExperience(){
        return this.yearOfExperience;
    }
}
