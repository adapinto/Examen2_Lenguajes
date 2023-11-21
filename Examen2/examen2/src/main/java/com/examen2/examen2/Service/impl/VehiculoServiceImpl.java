package com.examen2.examen2.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.examen2.Modelos.Vehiculo;
import com.examen2.examen2.Repositorios.VehiculoRepository;
import com.examen2.examen2.Service.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService{

    @Autowired
    private VehiculoRepository vehiculoRepository;


    //CREAR
    @Override
    public Vehiculo crearVehiculo(Vehiculo nvoVehiculo) {
        return vehiculoRepository.save(nvoVehiculo);  
    }


    //OBTENER TODOS
    @Override
    public List<Vehiculo> obtenerTodosVehiculo() {
        return this.vehiculoRepository.findAll();        
    }


    //OBTENER VEHICULO POR ID
    @Override
    public Vehiculo obtenerVehiculoPorId(int idVehiculo, Vehiculo vehiculo) {
           Vehiculo vehiculoEncontrado = this.vehiculoRepository.findById(idVehiculo).get();
     return vehiculoEncontrado;
    }
    
    
}
