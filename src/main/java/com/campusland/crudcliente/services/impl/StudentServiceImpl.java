package com.campusland.crudcliente.services.impl;

import org.springframework.stereotype.Service;

import com.campusland.crudcliente.repositories.StudentRepository;
import com.campusland.crudcliente.repositories.entities.Student;
import com.campusland.crudcliente.repositories.entities.Tuition;
import com.campusland.crudcliente.services.StudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        Tuition tuition = student.getTuition();
        if (tuition != null) {
            tuition.setStudent(student);
        }
        return studentRepository.save(student);
    }
    
}
