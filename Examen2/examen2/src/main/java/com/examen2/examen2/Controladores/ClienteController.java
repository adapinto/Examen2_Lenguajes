package com.examen2.examen2.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.examen2.Modelos.Cliente;
import com.examen2.examen2.Service.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    
@Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente nvoCliente){     
        return this.clienteServiceImpl.crearCliente(nvoCliente);
    }   
    
    
    @GetMapping("/obtener/todos")
    public List<Cliente> obtenerTodos(){
        return this.clienteServiceImpl.obtenerTodosCliente();
    }

    @GetMapping("/obtener/clienteId")
    public Cliente obtenerClientePorId(@RequestParam(name="idCliente") int idCliente,
                                  @RequestBody Cliente cliente){
        return this.clienteServiceImpl.obtenerClientePorId(idCliente, cliente);
    }
    
}
