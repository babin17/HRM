package com.example.clgp.controller.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.clgp.model.admin.*;
import com.example.clgp.repo.admin.*;

@RestController
@RequestMapping("/admin")
public class admin {

    @Autowired
    AdminRepo mAdminRepo;

    @GetMapping("/")
    public List<Admin> getAllAdmin(){
        return mAdminRepo.findAll();
    }


    @PostMapping("/a")
    Boolean addAdmin(@RequestBody Admin pAdmin){
        try{
            System.out.println("Successfully adding data into database");
            System.out.println("UName:" + pAdmin.getUsername() + "ID:" + pAdmin.getID());
            mAdminRepo.save(pAdmin);
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());

            return false;
        }
    }
}
