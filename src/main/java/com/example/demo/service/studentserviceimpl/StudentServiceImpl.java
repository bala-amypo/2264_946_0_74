package com.example.demo.service;




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