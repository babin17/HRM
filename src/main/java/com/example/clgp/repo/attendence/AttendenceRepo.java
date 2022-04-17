package com.example.clgp.repo.attendence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clgp.model.attendence.*;

@Repository
public interface AttendenceRepo extends JpaRepository<Attendence, Long> {}
