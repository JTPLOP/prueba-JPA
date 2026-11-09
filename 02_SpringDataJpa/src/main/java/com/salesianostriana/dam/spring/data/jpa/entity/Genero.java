package com.salesianostriana.dam.spring.data.jpa.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombreGenero;


}
