package com.campusland.crudcliente.services;

import java.util.List;

import com.campusland.crudcliente.repositories.entities.Factura;

public interface FacturaService {
    
    Factura save(Factura factura);

    List<Factura> findAll();

    void deleteById(Long id);

}
