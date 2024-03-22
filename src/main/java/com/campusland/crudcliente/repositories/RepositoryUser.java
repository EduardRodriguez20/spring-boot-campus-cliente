package com.campusland.crudcliente.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.campusland.crudcliente.repositories.entities.UserEntity;

public interface RepositoryUser extends CrudRepository<UserEntity,Long> {

    Optional<UserEntity> findByEmail(String email);
    
}
