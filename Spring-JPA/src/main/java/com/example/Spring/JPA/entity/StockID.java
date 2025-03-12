package com.example.Spring.JPA.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StockID implements Serializable {

    @Column(name = "id_libro", nullable = false)
    private Long idLibro;
    @Column(name = "idFormato", nullable = false)
    private Long idFormato;
    // Getters y Setters

    public StockID(){}
    public StockID(Long idLibro, Long idFormato) {
        this.idLibro = idLibro;
        this.idFormato = idFormato;
    }


    public Long getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Long id_libro) {
        this.idLibro = id_libro;
    }

    public Long getIdFormato() {
        return idFormato;
    }

    public void setIdFormato(Long id_formato) {
        this.idFormato = id_formato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockID that = (StockID) o;
        return Objects.equals(idLibro, that.idLibro) &&
                Objects.equals(idFormato, that.idFormato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLibro, idFormato);
    }
}
