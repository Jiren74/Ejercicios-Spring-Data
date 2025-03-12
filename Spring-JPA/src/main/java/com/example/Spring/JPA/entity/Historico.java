package com.example.Spring.JPA.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Historico")
public class Historico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", updatable = false)
    private Long id;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_libro", nullable = false)
    private Libro libro;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_formato", nullable = false)
    private Formato formato;

    @Column(name = "Unidades_libro_anteriores", nullable = false, length = 150)
    private Integer unidades;

    @Column(name = "Fecha", nullable = false)
    private Date fecha;

    @Column(name = "Diferencia", nullable = false)
    private int diferencia;

    public Historico(){

    }

    public Historico(Long id, Libro libro, Formato formato, Integer unidades, Date fecha, int diferencia) {
        this.id = id;
        this.libro = libro;
        this.formato = formato;
        this.unidades = unidades;
        this.fecha = fecha;
        this.diferencia = diferencia;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }
}
