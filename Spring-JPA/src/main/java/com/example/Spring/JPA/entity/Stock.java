package com.example.Spring.JPA.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Stock")
public class Stock implements Serializable {
    @EmbeddedId
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "stock_seq")
    @SequenceGenerator(name = "stock_seq", sequenceName = "stock_sequence", allocationSize = 1)
    @Column(name="ID", updatable = false)

     */
    private StockID id;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @MapsId("idLibro") // Mapea el campo idLibro de StockID
    @JoinColumn(name = "id_libro", nullable = false)
    private Libro libro;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @MapsId("idFormato") // Mapea el campo idFormato de StockID
    @JoinColumn(name = "id_formato", nullable = false)
    private Formato formato;

    @Column(name = "Fecha", nullable = false)
    private Date fecha;
    @Column(name = "Unidades_libro_anteriores", nullable = false, length = 150)
    private Integer unidades;



    public Stock() {

    }

    public Stock(StockID id, Libro libro, Formato formato, Integer unidades, Date fecha) {
        this.id = id;
        this.libro = libro;
        this.formato = formato;
        this.unidades = unidades;
        this.fecha = fecha;
    }

    public StockID getId() {
        return id;
    }

    public void setId(StockID id) {
        this.id = id;
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
}
