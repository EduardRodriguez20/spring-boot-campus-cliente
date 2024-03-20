package com.campusland.crudcliente.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.campusland.crudcliente.repositories.entities.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{
   
    @Query("SELECT p FROM Producto WHERE p.nombre LIKE %?1%")
    List<Producto> findByNombre(String nombre);
    
    List<Producto> findByNombreContainingIgnoreCase (String term);
}
