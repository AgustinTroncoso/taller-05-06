package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Table(name="counter")
@AllArgsConstructor
@NoArgsConstructor
public class Counter {
    
    @Id
    @Column(name="id_counter")
    private Long id_counter;

    @Column(name="nombre")
    private String nombre;

    @Column(name="porcentaje_victoria")
    private Float porcentaje_victoria;

    @Column(name="porcentaje_derrota")
    private Float porcentaje_derrota;



    @ManyToOne(mappedBy="nacionalidad",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Campeon campeon;

    
    @OneToOne
    @JoinColumn(name="id_nacionalidad",unique= true)
    private Nacionalidad nacionalidad;

    @OneToOne
    @JoinColumn(name="id_especie",unique= true)
    private Especie especie;
}
