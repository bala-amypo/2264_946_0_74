package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Student;
import com.example.demo.repostiory.StudentRepostiory;
import com.example.demo.service.StudentService;

import org.springframework.stereotype.Service;


@Service



public class StudentServiceImpl{

    @Autowired
    StudentRepostiory repo;


    @Override

    public Student createData(Student stu){
        return repo.save();
    }

    @Override
    public List<Student> fetchRecord(){
        return repo.findAll();
    }
}