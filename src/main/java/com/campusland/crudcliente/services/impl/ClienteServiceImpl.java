package com.campusland.crudcliente.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.campusland.crudcliente.repositories.RepositoryCliente;
import com.campusland.crudcliente.repositories.entities.Cliente;
import com.campusland.crudcliente.services.ClienteService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private RepositoryCliente repositoryCliente;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) repositoryCliente.findAll();
    }

    @SuppressWarnings("null")
    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return repositoryCliente.findById(id).orElse(null);
    }

    @Override
    public Cliente findByEmail(String email) {
        return repositoryCliente.findByEmail(email);
    }

    @SuppressWarnings("null")
    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return repositoryCliente.save(cliente);
    }

    @SuppressWarnings("null")
    @Override
    @Transactional
    public void delete(Long id) {
        Optional<Cliente> clienteOptinal=repositoryCliente.findById(id);
        if(clienteOptinal.isPresent()){
            repositoryCliente.delete(clienteOptinal.get());
        }       
    }

    @SuppressWarnings("null")
    @Override
    @Transactional
    public Cliente update(Long id, Cliente cliente) {
        Optional<Cliente> clienteCurrent=repositoryCliente.findById(id);
        if (clienteCurrent.isPresent()) {
            Cliente c = clienteCurrent.get();
            c.setNombre(cliente.getNombre());
            c.setApellido(cliente.getApellido());
            c.setEmail(cliente.getEmail());
            return repositoryCliente.save(c);
        }
        return null;
    }

    

}
