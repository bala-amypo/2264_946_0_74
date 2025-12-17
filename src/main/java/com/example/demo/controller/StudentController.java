package com.example.demo.controller;
import java.util.List;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController


public class StudentController {

    @Autowired
    StudentService ser;

    @PostMapping("/adddata")
    public Student createData(@RequestBody Student stu){
        return ser.createData(stu);
    }

    @GetMapping("/fetchrecord")
    public List<Student> fetchRecord(){
        return ser.fetchRecord();
    }

}
