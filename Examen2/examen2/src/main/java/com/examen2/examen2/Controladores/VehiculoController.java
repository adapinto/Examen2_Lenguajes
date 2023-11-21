package com.examen2.examen2.Controladores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.examen2.Modelos.Vehiculo;
import com.examen2.examen2.Service.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api/vehiculo")
public class VehiculoController {
    
    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/crear")
    public Vehiculo crearVehiculo(@RequestBody Vehiculo nvoVehiculo){     
        return this.vehiculoServiceImpl.crearVehiculo(nvoVehiculo);
    }   
    
    
    @GetMapping("/obtener/todos")
    public List<Vehiculo> obtenerTodos(){
        return this.vehiculoServiceImpl.obtenerTodosVehiculo();
    }

    @GetMapping("/obtener/vehiculoId")
    public Vehiculo obtenerVehiculoPorId(@RequestParam(name="idVehiculo") int idVehiculo,
                                  @RequestBody Vehiculo vehiculo){
        return this.vehiculoServiceImpl.obtenerVehiculoPorId(idVehiculo, vehiculo);
    }
    
}
