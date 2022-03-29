package com.example.hrmgmt;

import java.util.ArrayList;
import java.util.List;
import com.example.hrmdl.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/user")
public class Users {
    private List<User> mUsers = new ArrayList<>();

    public Users(){
        mUsers.addAll(List.of(
        new User("Babin", "babin.k@gmail.com", "Kathmandu", "xxxxxxxx", "zzzzzzzzzz"),
        new User("Rupesh", "rupesh.b@gmail.com", "North Caroline", "xxxxxxxxx", "zzzzzzzzzzz")
        ));
    }

    @GetMapping("/users")
    Iterable<User> getAllUsers(){
        return mUsers;
    }

    @PostMapping("/")
    User addUsers(@RequestBody User pUser){
        mUsers.add(pUser);
        return pUser;
    }
}
