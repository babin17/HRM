package com.example.hrmgmt;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.hrmdl.Admin;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/admin")
public class CAdmin {
    private List<Admin> mAdmin = new ArrayList<>();


    public CAdmin(){
        mAdmin.addAll(List.of(
            new Admin("admin01", "[pppppppppp]"),
            new Admin("admin02", "[ppppppppppp]")
        ));
    }

    @GetMapping("/")
    Iterable<Admin> getAllAdmin(){
        return mAdmin;
    }

    @PostMapping("/")
    Admin addAdmin(@RequestBody Admin pAdmin){
        mAdmin.add(pAdmin);
        return pAdmin;
    }
    
}
