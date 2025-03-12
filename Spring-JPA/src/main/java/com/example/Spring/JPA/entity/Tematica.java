package com.example.Spring.JPA.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Tematicas")
public class Tematica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", updatable = false)
    private Long id;

    @Column(name = "categoria", nullable = false, length = 150)
    private String categoria;


    public Tematica(){

    }
    public Tematica(Long id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
