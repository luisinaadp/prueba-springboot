package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface IStudentService {
    public void createStudent(Student stu);
    public List<Student> bringStudentsList();
    public Student bringStudent();
}

