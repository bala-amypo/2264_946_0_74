package com.example.demo.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    StudentRepository repo;

    @Override
    public Student createData(Student stu){
        return repo.save(stu);
    }
    @Override 
    public List<Student> fetchRecord(){
        return repo.findAll();
    }
    @Override
    public Optional<Student> fetchDataById(int id){
        return repo.findById(id);
    }  
}