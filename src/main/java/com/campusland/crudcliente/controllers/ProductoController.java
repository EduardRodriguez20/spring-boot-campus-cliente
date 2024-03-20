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

    @PostMapping("/")
    public Producto save(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @GetMapping("/")
    public List<Producto> findAll() {
        return productoService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Producto findById(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @GetMapping("/findByName/{email}")
    public Producto findByName(@PathVariable String nombre) {
        return productoService.findByName(nombre);
    }
    
    @PutMapping("/update/{id}")
    public Producto update(@PathVariable Long id, @RequestBody Producto producto) {
        return productoService.update(id, producto);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        productoService.delete(id);
    }

}
