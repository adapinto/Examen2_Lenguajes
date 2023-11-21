package com.examen2.examen2.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.examen2.Modelos.Cliente;
import com.examen2.examen2.Repositorios.ClienteRepository;
import com.examen2.examen2.Repositorios.tipoClienteRepository;
import com.examen2.examen2.Service.tipoClienteService;

@Service
public class tipoClienteServiceImpl implements tipoClienteService {

     @Autowired
      private tipoClienteRepository tipoClienteRepository;
    //CREAR

    @Override
    public tipoClienteService crearTipoCliente(tipoClienteService nvotipoCliente) {
       return tipoClienteRepository.save(nvotipoCliente);
    }
}
