package com.campusland.crudcliente.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.campusland.crudcliente.dto.FacturaDTO;
import com.campusland.crudcliente.repositories.entities.Factura;
import com.campusland.crudcliente.services.FacturaService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/facturas")
public class FacturaController {
    
    private FacturaService facturaService;

    @PostMapping("/")
    public Factura save(@RequestBody Factura factura) {
        return facturaService.save(factura);
    }

    @GetMapping("/")
    public List<FacturaDTO> findAll() {
        return facturaService.findAll();
    }

    

}
