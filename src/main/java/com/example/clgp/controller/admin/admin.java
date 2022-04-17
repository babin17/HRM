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

    @GetMapping("/admins")
    public List<Admin> getAllAdmin(){
        return mAdminRepo.findAll();
    }

    @PostMapping("/add")
    public Boolean addAdmin(@RequestBody Admin pAdmin){
        try{
            System.out.println("UName:" + pAdmin.getUsername() + "ID:" + pAdmin.getID());
            mAdminRepo.save(pAdmin);
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @PutMapping("/")
    public Boolean updateAdmin(@RequestBody Admin pAdmin){
        try{
            if(mAdminRepo.existsById(pAdmin.getID())){
                System.out.println("[+] this admin already exist, updating now.....");
                mAdminRepo.save(pAdmin);

                return true;
            }
            
            System.out.println("[+] admin doesn't exist, adding new admin now.....");
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @DeleteMapping("/")
    public String deleteAdmin(@RequestParam long id){
        try{
            mAdminRepo.deleteById(id);
            return "Successfully deleted admin of id: " + id + " .";
        }
        catch(Exception e){
            return e.getMessage();
        }
    }

    @GetMapping("/")
    public Admin getAdminByID(@RequestParam long id){
        try{
            if(mAdminRepo.existsById(id)){
                System.out.println("Found user by id");
                return mAdminRepo.getById(id);
            }

            System.out.println("not found user by id");
            return null;
        }

        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
