package com.example.demo.Repository;

import com.example.demo.model.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<student,Integer> { }