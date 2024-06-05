package com.example.demo.models;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name="rival")
public class Rival {
    @Id
      @Column(name="id_rival")
    private Long id_rival;

    @Column(name="nombre")
    private String nombre;
     @OneToOne
    @JoinColumn(name="id_nacionalidad",unique= true)
    private Nacionalidad nacionalidad;

    @OneToOne
    @JoinColumn(name="id_especie",unique= true)
    private Especie especie;
}
