package com.salesianostriana.dam.spring.data.jpa.data;

import com.salesianostriana.dam.spring.data.jpa.entity.Pelicula;
import com.salesianostriana.dam.spring.data.jpa.repository.CriticaRepository;
import com.salesianostriana.dam.spring.data.jpa.repository.GeneroRepository;
import com.salesianostriana.dam.spring.data.jpa.repository.PeliculaRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataCheck {


    private final CriticaRepository criticaRepository;
    private final PeliculaRepository peliculaRepository;
    private final GeneroRepository generoRepository;

   // Long id = 1L;

    @PostConstruct
    public void comprobarDatos() {

        List<Pelicula> listadoPelis = peliculaRepository.findAll();

        System.out.println(listadoPelis);


      // Pelicula peli1 = peliculaRepository.findById(id);



    }

}
