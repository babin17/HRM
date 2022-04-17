package com.example.clgp.repo.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clgp.model.role.*;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long>{}
