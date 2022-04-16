package com.example.clgp.repo.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.clgp.model.admin.*;

@Repository
public interface AdminRepo extends JpaRepository<Admin , Long>{
    // List<Admin> getAdminById(long id);
    List<Admin> getAdminByUsername(String username);
}


