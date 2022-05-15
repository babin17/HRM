package com.example.clgp.controller.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.clgp.model.employee.*;
import com.example.clgp.repo.Employee.*;


@RestController
@RequestMapping("/employee")
public class employee {

    @Autowired
    EmployeeRepo mEmployeeRepo;


    // GETTING ALL USERS
    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return mEmployeeRepo.findAll();
    }


    // GETTING SINGLE USER BY ID
    // /employee/?id=1
    // will return employee with id of 1, otherwise return null
    @GetMapping("/")
    public Employee getAdminByID(@RequestParam long id){
        try{
            if(mEmployeeRepo.existsById(id)){
                System.out.println("Found user by id");
                return mEmployeeRepo.getById(id);
            }

            return null;
        }

        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    // Creating new account for employee
    // only authorized admin can create an employee account
    @PostMapping("/add")
    public Boolean createEmployeeAccount(@RequestBody Employee pEmployee){
        try{
            System.out.println("creating new user account for: " + pEmployee.getUsername());
            mEmployeeRepo.save(pEmployee);

            return true;
        }

        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }


    // this endpoint is for deleting employee account
    // only authorized by admin and not by other users
    @DeleteMapping("/")
    public String deleteEmployeeAccount(@RequestParam long id){
        try{
            mEmployeeRepo.deleteById(id);
            return "Successfully deleted admin of id: " + id + " .";
        }

        catch(Exception e){
            return e.getMessage();
        }
    }


    // to update employee account
    @PutMapping("/")
    public Boolean updateEmployeeAccount(@RequestBody Employee pEmployee){
        try{
            if(mEmployeeRepo.existsById(pEmployee.getID())){
                mEmployeeRepo.save(pEmployee);

                return true;
            }


            System.out.println("[+] Employee account doesn't exist, creating new employee account now....");
            return true;
        }

        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }


}
