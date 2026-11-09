package com.salesianostriana.dam.spring.data.jpa.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Pelicula {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String titulo;

    private LocalDate anioEstreno;

    @ToString.Exclude
    @Builder.Default
    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Critica> criticas = new ArrayList<>();

    @ToString.Exclude
    @ManyToMany(cascade = {CascadeType.PERSIST})
    @Builder.Default
    @JoinTable(name = "Pelicula_generos",
            joinColumns = @JoinColumn(name = "pelicula_id"),
            inverseJoinColumns = @JoinColumn(name = "generos_id"))
    private List<Genero> generos = new ArrayList<>();

    public Pelicula addCritica(Critica c) {
        criticas.add(c);
        return this;
    }

    public Pelicula removeCritica(Critica c) {
        criticas.remove(c);
        return this;
    }

}
