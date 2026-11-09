package com.salesianostriana.dam.spring.data.jpa.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
@RequiredArgsConstructor
public class Critica {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String autor;

    private String texto;

    private double puntuacion;


    @ManyToOne
    @JoinColumn(name = "pelicula_id")
    private Pelicula pelicula;

}
