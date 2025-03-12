package com.example.Spring.JPA.entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name="Formatos")
public class Formato {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", updatable = false)
    private Long id;

    @Column(name = "descripcion", nullable = false, length = 150)
    private String descripcion;

    public Formato() {
    }

    public Formato(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    @NotNull
    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    public Long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
