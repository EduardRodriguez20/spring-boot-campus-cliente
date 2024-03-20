package com.campusland.crudcliente.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campusland.crudcliente.repositories.ProductoRepository;
import com.campusland.crudcliente.repositories.entities.Producto;
import com.campusland.crudcliente.services.ProductoService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProductoServiceImpl implements ProductoService{

    private ProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return (Producto) productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto findByName(String name) {
        return (Producto) productoRepository.findByNombre(name);
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto update(Long id, Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void delete(Long id) {
        productoRepository.deleteById(id);
    }
    
}
