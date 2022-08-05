package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService{
    @Override
    public void createStudent(Student stu) {
        //code to create a student
    }

    @Override
    public List<Student> bringStudentsList() {
        //code tu return a student list
        return null;
    }

    @Override
    public Student bringStudent() {
        //code to return a student
        return null;
    }
}

