package com.example.demo.models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Table(name="nacionalidad")
public class Nacionalidad {
    @Id
        @Column(name="id_nacionalidad")
    private Long id_nacionalidad;

    @Column(name="nombre")
    private Enum nombre;

    @OneToOne(mappedBy="nacionalidad",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Counter counter;

    @OneToOne(mappedBy="nacionalidad",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Rival rival;
    @OneToOne(mappedBy="nacionalidad",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Campeon Campeon;
}
