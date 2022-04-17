package com.example.clgp.repo.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.clgp.model.department.*;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {}
