package com.example.demo.api;

import com.example.demo.model.student;
import com.example.demo.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/student")
@CrossOrigin("*")
@RestController
public class studentController {

    @Autowired
    private studentService studentService;

    @PostMapping
    public void addstudent(student student){
        this.studentService.addstudent(student);
    }
}
