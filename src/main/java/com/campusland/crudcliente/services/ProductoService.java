package com.campusland.crudcliente.services;

import java.util.List;

import com.campusland.crudcliente.repositories.entities.Producto;

public interface ProductoService{
    
    List<Producto> findAll();

    Producto findById(Long id);

    Producto findByName(String name);

    Producto save(Producto producto);

    Producto update(Long id, Producto producto);

    void delete(Long id);

}
