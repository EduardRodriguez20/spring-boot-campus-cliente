package com.campusland.crudcliente.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusland.crudcliente.repositories.entities.Student;
import com.campusland.crudcliente.services.StudentService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@AllArgsConstructor
@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;
    
    @PostMapping("/")
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }
    

}
