package com.example.Spring.JPA.service;

import com.example.Spring.JPA.entity.*;
import jakarta.transaction.Transactional;

import java.time.Year;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    //Métodos de las entidades
    List<Usuario> findAllUsuarios();

    List<Autor> findAllAutores();

    Optional<Autor> findAllById(Long id);


    //Editorial
    List<Editorial> findAllEditoriales();

    Optional<Editorial> findAllEditorialById(Long id);

    Editorial saveEditorial(Editorial editorial);

    void deleteEditorial(Long id);

    //Formato

    List<Formato> findAllFormato();

    Optional<Formato> findAllFormatoById(Long id);

    Formato saveFormato(Formato formato);

    void deleteFormato(Long id);


    //Libro
    List<Libro> findAllLibro();

    Optional<Libro> findAllLibroById(Long id);

    Libro saveLibro(Libro libro);

    void deleteLibro(Long id);


    //Stock
    List<Stock> findAllStock();

    Optional<Stock> findAllStockById(Long id);

    Stock saveStock(Stock stock);

    void deleteStock(Long id);


    //Tematica
    List<Tematica> findAllTematica();

    Optional<Tematica> findAllTematicaById(Long id);

    Tematica saveTematica(Tematica tematica);

    void deleteTematica(Long id);


    //Ejercicio 4
    List<?> obtenerLibrosPublicadosDespuesDeQuery(Date anioPublicacion) ;
    //Ejercicio 5
    List<?> obtenerLibrosPublicadosDespuesDeMetodo(Date anioPublicacion);

    //Ejercicio 6
    List<?> obtenerLibrosPublicadosUnAnio(Integer anio);

    List<?> obtenerLibrosIsbn(String isbn);

    List<?> obtenerLibrosEditorial(String editorial);

    List<?> obtenerLibrosEditorialAnio(String editorial, Integer anio);
}
