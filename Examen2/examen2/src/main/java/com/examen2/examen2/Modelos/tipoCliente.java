package com.examen2.examen2.Modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tipocliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class tipoCliente {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idtipocliente")
    private int idTipoCliente;

    @Column(name="descripcion")
    private String descripcion;
//cuentas=TipoCliente 1
//movimientos=clientes M

@OneToMany(mappedBy = "tipocliente", cascade = CascadeType.ALL)
private List<Cliente> clientes;

}
