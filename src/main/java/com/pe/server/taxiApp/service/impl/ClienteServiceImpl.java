package com.pe.server.taxiApp.service.impl;

import com.pe.server.taxiApp.models.Cliente;
import com.pe.server.taxiApp.models.Cuenta;
import com.pe.server.taxiApp.repository.ClienteRepository;
import com.pe.server.taxiApp.repository.CuentaRepository;
import com.pe.server.taxiApp.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepo;



    @Override
    public Cliente getById(Long id) {
        return clienteRepo.findOne(id);
    }

    @Override
    public Cliente findByNombreAndApellido(String nombre,String apellido) {
        return clienteRepo.findByNombreAndApellido(nombre,apellido);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        
        return clienteRepo.save(cliente);
    }

    @Override
    public void delete(Long id) {
        clienteRepo.delete(id);
    }

    @Override
    public List<Cliente> getAll() {
        return (List<Cliente>) clienteRepo.findAll();
    }
}
