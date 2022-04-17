package com.example.clgp.controller.attendence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.clgp.model.attendence.*;
import com.example.clgp.repo.attendence.*;

@RestController
@RequestMapping("/attendance")
public class attendence {
    @Autowired
    AttendenceRepo mAttendenceRepo;


    @GetMapping("/attendances")
    public List<Attendence> getAttendanceHistory(){
        try{
            return mAttendenceRepo.findAll();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    @GetMapping("/")
    public Attendence getPersonalAttendanceHistory(@RequestParam long id){
        try{
            if(mAttendenceRepo.existsById(id)){
                return mAttendenceRepo.getById(id);
            }   

            System.out.println("Not found any attendance history");

            return null;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    @PostMapping("/checkin")
    public Boolean checkIn(@RequestBody Attendence pAttendence){
        try{
            System.out.println(pAttendence.getInTime());
            mAttendenceRepo.save(pAttendence);
            return false;
        }

        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    // no delete and update options for attendance.
}
