package com.examen2.examen2.Service;

import java.util.List;

import com.examen2.examen2.Modelos.Cliente;

public interface ClienteService {

    public Cliente crearCliente(Cliente nvoCliente);

    public List<Cliente> obtenerTodosCliente();

    public Cliente obtenerClientePorId(int idCliente, Cliente cliente);

}

