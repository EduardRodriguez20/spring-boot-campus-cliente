package com.campusland.crudcliente.repositories;

import org.springframework.data.repository.CrudRepository;

import com.campusland.crudcliente.repositories.entities.Tuition;

public interface TuitionRepository extends CrudRepository<Tuition, Long>{
    
}
