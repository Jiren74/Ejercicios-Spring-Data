package com.example.Spring.JPA.repository;

import com.example.Spring.JPA.entity.Autor;
import com.example.Spring.JPA.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.Year;
import java.util.Date;
import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {


    //Consulta ejercicio 4
    @Query("SELECT l FROM Libro l WHERE l.anioPublicacion > :fecha")
    List<Libro> findLibrosPublicadosDespuesDe(@Param("fecha") Date fecha);
    //Consulta Ejercicio 5 con método
    List<Libro> findByAnioPublicacionAfter(Date fecha);

    //Consultas del Ejercicio 6
    //Buscar libros según un año en específico
    @Query("SELECT l.titulo FROM Libro l where year(l.anioPublicacion)=:anio")
    List<?> findLibrosPublicadosUnAnio(@Param("anio") int anio);

    //Buscar libros según un isb en específico
    @Query("SELECT l.titulo FROM Libro l where l.isbn=:isbn")
    List<?> findLibrosIsbn(@Param("isbn") String isbn);

    //Buscar libros según una editorial(RBA) en específico
    @Query("SELECT l.titulo FROM Libro l JOIN Editorial e on l.editorial.id = e.id AND e.nombreEditorial=:nombreEditorial")
    List<?> findLibrosEditorial(@Param("nombreEditorial") String nombreEditorial);

    //Buscar libros según una editorial(RBA) y año(1986) en específico
    @Query("SELECT l.titulo FROM Libro l WHERE l.editorial.nombreEditorial = :nombreEditorial " +
            "AND YEAR(l.anioPublicacion) = :anio")
    List<?> findLibrosEditorialAnio(@Param("nombreEditorial") String nombreEditorial,@Param("anio") Integer anio);


}
