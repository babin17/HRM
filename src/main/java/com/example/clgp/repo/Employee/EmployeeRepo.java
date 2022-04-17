package com.example.clgp.repo.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.clgp.model.employee.*;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    List<Employee> getEmployeeByUsername(String username);
}
