package com.examen2.examen2.Modelos;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="vehiculo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Vehiculo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idvehiculo")
    private int idVehiculo;

    @Column(name="marca")
    private String marca;

    @Column(name="anio")
    private int anio;

    @Column(name="disponible")
    private boolean disponible;

    @ManyToOne
    @JoinColumn(name = "idtipovehiculo", referencedColumnName = "idtipovehiculo")
    private tipoVehiculo tipoVehiculo;

}
