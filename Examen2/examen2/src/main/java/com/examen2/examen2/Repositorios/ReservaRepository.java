package com.examen2.examen2.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen2.examen2.Modelos.Reserva;

public interface ReservaRepository extends JpaRepository <Reserva,Integer> {
    
}
