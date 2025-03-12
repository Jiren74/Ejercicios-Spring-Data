package com.example.Spring.JPA.entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@Table(name="Libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", updatable = false)
    private Long id;

    @Column(name = "isbn", unique = true, nullable = false, length = 150)
    private String isbn;

    @Column(name = "titulo", nullable = false, length = 150)
    private String titulo;

    @Column(name = "anio_publicacion", updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private Date anioPublicacion;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_autor", nullable = false)
    private Autor autor;
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_editorial", nullable = false)
    private Editorial editorial;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_categoria", nullable = false)
    private Tematica tematica;

    @Column(name = "PVP", nullable = false, scale=2)
    private double pvp;

    public Libro(){

    }

    public Libro(Long id, String isbn, String titulo, Date anioPublicacion, Editorial editorial, Tematica tematica, double pvp) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.editorial = editorial;
        this.tematica = tematica;
        this.pvp = pvp;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getAnio() {
        return anioPublicacion;
    }

    public void setAnio(Date anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }
}
