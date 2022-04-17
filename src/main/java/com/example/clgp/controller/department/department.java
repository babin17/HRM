package com.example.clgp.controller.department;

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
import com.example.clgp.repo.department.*;
import com.example.clgp.model.department.*;

@RestController
@RequestMapping("/department")
public class department {
    @Autowired
    DepartmentRepo mDepartmentRepo;


    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        return mDepartmentRepo.findAll();
    } 


    @GetMapping("/")
    public Department getDepartmentByID(@RequestParam long id){
        try{
            if(mDepartmentRepo.existsById(id)){
                System.out.println("Found department by id");
                return mDepartmentRepo.getById(id);
            }

            return null;
        }

        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    @PostMapping("/add")
    public Boolean createNewDepartment(@RequestBody Department pDepartment){
        try{
            System.out.println("creating new department" + pDepartment.getName());
            mDepartmentRepo.save(pDepartment);

            return true;
        }

        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @DeleteMapping("/")
    public String deleteDepartment(@RequestParam long id){
        try{
            mDepartmentRepo.deleteById(id);
            return "Successfully deleted admin of id: " + id + " .";
        }

        catch(Exception e){
            return e.getMessage();
        }
    }


    @PutMapping("/")
    public Boolean updateDepartmentInfo(@RequestBody Department pDepartment){
        try{
            if(mDepartmentRepo.existsById(pDepartment.getID())){
                mDepartmentRepo.save(pDepartment);

                return true;
            }

            System.out.println("[+] Department doesn't exist, creating new department....");
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

}
