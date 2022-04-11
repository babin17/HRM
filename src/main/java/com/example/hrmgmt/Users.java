package com.example.hrmgmt;

import java.util.List;

import com.example.hrmdl.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

interface UserRepository extends CrudRepository<User, String>{}

@RestController
@RequestMapping("/user")
public class Users {
    private final UserRepository mUserRepository;

    public Users(UserRepository userRepository){
        this.mUserRepository = userRepository;

        List<User> mUser = List.of(
            new User("Babin", "babin.k@gmail.com", "Kathmandu", "xxxxxxxx", "zzzzzzzzzz"),
            new User("Rupesh", "rupesh.b@gmail.com", "North Caroline", "xxxxxxxxx", "zzzzzzzzzzz")
        );
        System.out.print(mUser);

        this.mUserRepository.saveAll(mUser);
    }

    @GetMapping("/users")
    Iterable<User> getAllUsers(){
        System.out.println("Returning all Value from User repository");
        return this.mUserRepository.findAll();
    }

    @PostMapping("/")
    User addUsers(@RequestBody User pUser){
        mUserRepository.save(pUser);
        return pUser;
    }

    @DeleteMapping("/{id}")
    boolean deleteUser(@PathVariable String id){
        try{
            mUserRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage().toString());
            return false;
        }
    }
}
