package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity(name="INTERACCION")
public class Interaccion {

     @Id
     @Column(name="id_interaccion")
    private Long id_interaccion;

    @Column(name="nombre")
    private String nombre;

    @Column(name="limite")
    private Integer limite;
}