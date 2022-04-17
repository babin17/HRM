package com.example.clgp.controller.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.clgp.repo.role.*;

import java.util.List;

import com.example.clgp.model.role.*;

@RestController
@RequestMapping("/role")
public class role {
    @Autowired
    RoleRepo mRoleRepo;


    @GetMapping("/roles")
    public List<Role> getAllRoles(){
        try{
            return mRoleRepo.findAll();
        }
        catch(Exception e){
            System.out.println(e.getMessage());

            return null;
        }
    }


    @GetMapping("/")
    public Role getMyRoles(@RequestParam Long id){
        try{
            if(mRoleRepo.existsById(id)){
                return mRoleRepo.getById(id);
            }

            System.out.println("No found any personal roles..");
            return null;
        }

        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }



    // only admin can access this
    @PostMapping("/add")
    public Boolean createNewRole(@RequestBody Role mRole){
        try{
            System.out.println("Creating new role: " + mRole.getJobTitle());
            mRoleRepo.save(mRole);
            return true;
        }

        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }


    @PutMapping("/")
    public Boolean updateRole(@RequestBody Role mRole){
        try{
            if(mRoleRepo.existsById(mRole.getID())){
                System.out.println("Updating role with title: " + mRole.getJobTitle());

                mRoleRepo.save(mRole);
                return true;
            }

            System.out.println("Role doesnt exist in the database, creating new role....");
            return false;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }




    @DeleteMapping("/")
    public Boolean deleteRole(@RequestParam Long id){
        try{
            mRoleRepo.deleteById(id);
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
