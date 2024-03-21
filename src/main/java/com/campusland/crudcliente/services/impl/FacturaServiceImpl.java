package com.campusland.crudcliente.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.campusland.crudcliente.dto.FacturaDTO;
import com.campusland.crudcliente.dto.convert.FacturaDTOConvert;
import com.campusland.crudcliente.repositories.FacturaRepository;
import com.campusland.crudcliente.repositories.entities.Factura;
import com.campusland.crudcliente.services.FacturaService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FacturaServiceImpl implements FacturaService {

    private FacturaRepository facturaRepository;
    private FacturaDTOConvert facturaConvert;

    @SuppressWarnings("null")
    @Override
    public Factura save(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public List<FacturaDTO> findAll() {
        List<FacturaDTO> facturaDTOs = new ArrayList<>();
        List<Factura> facturas = (List<Factura>) facturaRepository.findAll();
        for (Factura factura : facturas){
            facturaDTOs.add(facturaConvert.convertDTO(factura));
        }
        return facturaDTOs;
    }

    @SuppressWarnings("null")
    @Override
    public void deleteById(Long id) {
        facturaRepository.deleteById(id);
    }

    
    
}
