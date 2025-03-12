package com.example.Spring.JPA.entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;


@Entity
@Table(name="Editoriales")
public class Editorial {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", updatable = false)
    private Long id;

    @Column(name = "nombre_editorial", nullable = false, length = 150)
    public String nombreEditorial;

    @Column(name = "razon_social", nullable = false, length = 150)
    public String razonSocial;

    public Editorial(){

    }

    public Editorial(Long id, String nombreEditorial, String razonSocial) {
        this.id = id;
        this.nombreEditorial = nombreEditorial;
        this.razonSocial = razonSocial;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
