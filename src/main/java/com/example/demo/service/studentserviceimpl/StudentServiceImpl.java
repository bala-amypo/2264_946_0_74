package com.example.demo.service;



public class StudentServiceImpl{


    public Student createData(Student stu){
        return rep.save();
    }
    public Student fetchRecord(){
        return rep.findAll();
    }
}