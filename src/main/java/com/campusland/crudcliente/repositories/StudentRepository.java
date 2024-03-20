package com.campusland.crudcliente.repositories;

import org.springframework.data.repository.CrudRepository;

import com.campusland.crudcliente.repositories.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{
    
}
