package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Student {

    private int id;
    private String name;
    private String lastname;

    public Student(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

}
