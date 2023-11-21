package com.examen2.examen2.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen2.examen2.Modelos.tipoCliente;

public interface tipoClienteRepository extends JpaRepository <tipoCliente,Integer> {
    
}
