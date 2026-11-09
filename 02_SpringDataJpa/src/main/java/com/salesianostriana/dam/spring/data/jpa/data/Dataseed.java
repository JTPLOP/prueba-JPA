package com.salesianostriana.dam.spring.data.jpa.data;

import com.salesianostriana.dam.spring.data.jpa.entity.Critica;
import com.salesianostriana.dam.spring.data.jpa.entity.Genero;
import com.salesianostriana.dam.spring.data.jpa.entity.Pelicula;
import com.salesianostriana.dam.spring.data.jpa.repository.CriticaRepository;
import com.salesianostriana.dam.spring.data.jpa.repository.GeneroRepository;
import com.salesianostriana.dam.spring.data.jpa.repository.PeliculaRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class Dataseed {

    private final CriticaRepository criticaRepository;
    private final PeliculaRepository peliculaRepository;
    private final GeneroRepository generoRepository;

    @PostConstruct
    public void cargarDatos() {

        Genero g1 = Genero.builder()
                .id(1L)
                .nombreGenero("Terror")
                .build();

        Genero g2 = Genero.builder()
                .id(2L)
                .nombreGenero("Comedia")
                .build();

        Pelicula p1 = Pelicula.builder()
                .id(1L)
                .titulo("Pelicula 1")
                .anioEstreno(LocalDate.now())
                .build();

        Pelicula p2 = Pelicula.builder()
                .id(2L)
                .titulo("Pelicula 2")
                .anioEstreno(LocalDate.now())
                .build();

        Critica c1 = Critica.builder()
                .id(1L)
                .autor("Manolo")
                .texto("Hola mundo 1")
                .puntuacion(2)
                .build();

        Critica c2 = Critica.builder()
                .id(2L)
                .autor("Manoloo")
                .texto("Hola mundo 2")
                .puntuacion(5)
                .build();

        Critica c3 = Critica.builder()
                .id(3L)
                .autor("Manolin")
                .texto("Hola mundo 3")
                .puntuacion(10)
                .build();

        generoRepository.save(g1);
        generoRepository.save(g2);

        p1.getGeneros().add(g1);
        p2.getGeneros().add(g2);


        p1.addCritica(c1);
        p1.addCritica(c2);
        p2.addCritica(c3);

        peliculaRepository.save(p1);
        peliculaRepository.save(p2);

    }



}
