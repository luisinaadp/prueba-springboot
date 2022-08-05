package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlumnoController {

    @PostMapping ("/student")
    public String addStudent (@RequestBody Student alu) {
        //vamos a simular el mensaje de creación de un alumno
        return "Alumno: " + alu.getName() + " agregado correctamente";

    }



    @GetMapping ("/test")
    ResponseEntity<String> bringAnswer() {
        //podemos manipular en este caso el status code
        return new ResponseEntity<>("Esto es una prueba de Response Entity", HttpStatus.OK);
    }





    @GetMapping("/students/all")
    @ResponseBody
    public List<Student> findAlumnos() {

        List<Student> studentsList = new ArrayList<Student>();
        studentsList.add(new Student(1, "Mario", "Bross"));
        studentsList.add(new Student(2, "Peach", "Princesa"));
        studentsList.add(new Student(3, "Baby", "Bowser"));

        return studentsList;

    }
}
