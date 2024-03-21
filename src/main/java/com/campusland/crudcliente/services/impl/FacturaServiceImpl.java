package com.campusland.crudcliente.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campusland.crudcliente.repositories.FacturaRepository;
import com.campusland.crudcliente.repositories.entities.Factura;
import com.campusland.crudcliente.services.FacturaService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FacturaServiceImpl implements FacturaService {

    private FacturaRepository facturaRepository;

    @SuppressWarnings("null")
    @Override
    public Factura save(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public List<Factura> findAll() {
        return (List<Factura>) facturaRepository.findAll();
    }

    @SuppressWarnings("null")
    @Override
    public void deleteById(Long id) {
        facturaRepository.deleteById(id);
    }

    
    
}
