package com.example.demo.service;

import com.example.demo.Repository.studentRepository;
import com.example.demo.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {
    @Autowired
    private studentRepository studentRepository;

    public void addstudent(student student){
        this.studentRepository.save(student);
    }
}
