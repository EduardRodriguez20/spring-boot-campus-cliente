package com.campusland.crudcliente.services;

import java.util.List;

import com.campusland.crudcliente.dto.FacturaDTO;
import com.campusland.crudcliente.repositories.entities.Factura;

public interface FacturaService {
    
    Factura save(Factura factura);

    List<FacturaDTO> findAll();

    void deleteById(Long id);

}
