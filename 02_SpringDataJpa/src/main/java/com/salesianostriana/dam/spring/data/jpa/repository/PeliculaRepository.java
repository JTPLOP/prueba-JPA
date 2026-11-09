package com.salesianostriana.dam.spring.data.jpa.repository;

import com.salesianostriana.dam.spring.data.jpa.entity.Genero;
import com.salesianostriana.dam.spring.data.jpa.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository
        <Pelicula,Long> {
}
