package com.salesianostriana.dam.spring.data.jpa.repository;

import com.salesianostriana.dam.spring.data.jpa.entity.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository
    <Genero,Long> {
}
