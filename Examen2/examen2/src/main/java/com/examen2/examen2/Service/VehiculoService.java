package com.examen2.examen2.Service;

import java.util.List;

import com.examen2.examen2.Modelos.Vehiculo;

public interface VehiculoService {
    
    public Vehiculo crearVehiculo (Vehiculo nvoVehiculo);

    public List<Vehiculo> obtenerTodosVehiculo();

    public Vehiculo obtenerVehiculoPorId(int idVehiculo, Vehiculo vehiculo);
}
