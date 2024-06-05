package com.example.demo.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="especie")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Especie {
     @Id
      @Column(name="id_especie")
    private Long id_especie;
    @Column(name="nombre")
    private Enum nombre;
 @OneToOne(mappedBy="especie",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Counter counter;

    @OneToOne(mappedBy="especie",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Rival rival;
    @OneToOne(mappedBy="especie",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Campeon campeon;
}
