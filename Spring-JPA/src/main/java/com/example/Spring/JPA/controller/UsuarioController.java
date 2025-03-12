package com.example.Spring.JPA.controller;

import com.example.Spring.JPA.entity.*;
import com.example.Spring.JPA.service.UsuarioService;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.text.ParseException;
import java.time.Year;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("autores")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;


    @GetMapping("/findAllUsuarios")
    public List<Usuario> findAllUsuarios(){
        return usuarioService.findAllUsuarios();
    }

    @GetMapping("/findAllAutores")
    public List<Autor> findAllAutores(){
        return usuarioService.findAllAutores();
    }

    @GetMapping("/findAllFormatos")
    public List<Formato> findAllFormatos(){
        return usuarioService.findAllFormato();
    }

    @GetMapping("/findAllLibros")
    public List<Libro> findAllLibros(){
        return usuarioService.findAllLibro();
    }

    @GetMapping("/findAllStock")
    public List<Stock> findAllStock(){
        return usuarioService.findAllStock();
    }

    @GetMapping("/findAllTematica")
    public List<Tematica> findAllTematica(){
        return usuarioService.findAllTematica();
    }


    //Ejercicio 4
    @GetMapping("/publicadosDespuesDeQuery")
    public List<?> obtenerLibrosPublicadosDespuesDe(@Valid @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date anioPublicacion){
        return usuarioService.obtenerLibrosPublicadosDespuesDeQuery(anioPublicacion);
    }

    //Ejercicio 5
    @GetMapping("/publicadosDespuesDeMetodo")
    public List<?> obtenerLibrosPublicadosDespuesDeMetodo(@Valid @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date anioPublicacion){
        return usuarioService.obtenerLibrosPublicadosDespuesDeMetodo(anioPublicacion);
    }

    //Ejercicio 6
    @GetMapping("/anioEspecifico/{anio}")
    public List<?> obtenerLibrosPublicadosUnAnio(@Valid @PathVariable int anio){
        //int anio = 2001;
        return usuarioService.obtenerLibrosPublicadosUnAnio(anio);
    }

    @GetMapping("/isbnEspecifico/{isbn}")
    public List<?> obtenerLibrosIsbn(@Valid @PathVariable String isbn){
        //String isbn = "87919878";
        return usuarioService.obtenerLibrosIsbn(isbn);
    }

    @GetMapping("/editorialEspecifico/{editorial}")
    public List<?> obtenerLibrosEditorial(@Valid @PathVariable String editorial){
        //String editorial = "RBA";
        return usuarioService.obtenerLibrosEditorial(editorial);
    }

    @GetMapping("/editorialAnioEspecifico/{editorial}/{anio}")
    public List<?> obtenerLibrosEditorialAnio(@Valid @PathVariable String editorial, @Valid @PathVariable int anio){
        //String editorial = "Planeta";
        //Integer anio = 1986;
        return usuarioService.obtenerLibrosEditorialAnio(editorial, anio);
    }

}
