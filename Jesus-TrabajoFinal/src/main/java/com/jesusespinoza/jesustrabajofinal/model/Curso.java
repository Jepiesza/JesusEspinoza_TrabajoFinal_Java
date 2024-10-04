package com.jesusespinoza.jesustrabajofinal.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCurso;

    @Column(nullable = false, length = 20)
    private String nombre;

    @Column(nullable = false, length = 5)
    private String siglas;

    @Column(nullable = false)
    private boolean estado;
}
