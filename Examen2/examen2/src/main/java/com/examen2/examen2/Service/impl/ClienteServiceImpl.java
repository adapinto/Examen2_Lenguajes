package com.examen2.examen2.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.examen2.Modelos.Cliente;
import com.examen2.examen2.Repositorios.ClienteRepository;
import com.examen2.examen2.Service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    //CREAR
    @Override
    public Cliente crearCliente(Cliente nvoCliente) {
        return clienteRepository.save(nvoCliente);  
    }


    //OBTENER TODOS LOS CLIENTES
    @Override
    public List<Cliente> obtenerTodosCliente() {
        return this.clienteRepository.findAll();        
    }


    //OBTENER CLIENTE POR ID
    @Override
    public Cliente obtenerClientePorId(int idCliente, Cliente cliente) {
           Cliente cteEncontrado = this.clienteRepository.findById(idCliente).get();
     return cteEncontrado;
    }
    
}
