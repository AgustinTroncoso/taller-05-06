package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name="CAMPEON")
public class Campeon {
    @Id
    @Column(name="id_campeon")
    private Long id_campeon;

    @Column(name="tipo_ataque")
    private String tipo_ataque;

    @Column(name="vida_base")
    private Long vida_base;

    @Column(name="mana_bool")
    private Short mana_bool;

    @Column(name="energia_bool")
    private Short energia_bool;

    @Column(name="velocidad_ataque_base")
    private Float velocidad_ataque_base;

    @Column(name="velocidad_movimiento_base")
    private Long velocidad_movimiento_base;

    @Column(name="nombre")
    private String nombre;

@OneToOne
    @JoinColumn(name="id_nacionalidad",unique= true)
    private Nacionalidad nacionalidad;

    @OneToOne
    @JoinColumn(name="id_especie",unique= true)
    private Especie especie;


      
    @ManyToOne
    @JoinColumn(name="id_nacionalidad",unique= true)
    private Campeon campeon;
}