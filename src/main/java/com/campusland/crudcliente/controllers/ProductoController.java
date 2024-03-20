package com.campusland.crudcliente.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.campusland.crudcliente.repositories.entities.Producto;
import com.campusland.crudcliente.services.ProductoService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/producto")
public class ProductoController {
    
    private ProductoService productoService;

    @RequestMapping("/save")
    public Producto save(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @RequestMapping("/findAll")
    public List<Producto> findAll() {
        return productoService.findAll();
    }

    @RequestMapping("/findById/{id}")
    public Producto findById(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @RequestMapping("/findByName/{email}")
    public Producto findByName(@PathVariable String nombre) {
        return productoService.findByName(nombre);
    }
    
    @RequestMapping("/update/{id}")
    public Producto update(@PathVariable Long id, @RequestBody Producto producto) {
        return productoService.update(id, producto);
    }

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        productoService.delete(id);
    }

}
