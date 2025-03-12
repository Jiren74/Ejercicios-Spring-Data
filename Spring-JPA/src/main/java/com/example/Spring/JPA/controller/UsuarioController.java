package com.example.Spring.JPA.controller;

import com.example.Spring.JPA.entity.*;
import com.example.Spring.JPA.service.UsuarioService;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public List<?> obtenerLibrosPublicadosDespuesDe(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date anioPublicacion){
        return usuarioService.obtenerLibrosPublicadosDespuesDeQuery(anioPublicacion);
    }

    //Ejercicio 5
    @GetMapping("/publicadosDespuesDeMetodo")
    public List<?> obtenerLibrosPublicadosDespuesDeMetodo(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date anioPublicacion){
        return usuarioService.obtenerLibrosPublicadosDespuesDeMetodo(anioPublicacion);
    }

    //Ejercicio 6
    @GetMapping("/anioEspecifico")
    public List<?> obtenerLibrosPublicadosUnAnio(){
        int anio = 2001;
        return usuarioService.obtenerLibrosPublicadosUnAnio(anio);
    }

    @GetMapping("/isbnEspecifico")
    public List<?> obtenerLibrosIsbn(){
        String isbn = "87919878";
        return usuarioService.obtenerLibrosIsbn(isbn);
    }

    @GetMapping("/editorialEspecifico")
    public List<?> obtenerLibrosEditorial(){
        String editorial = "RBA";
        return usuarioService.obtenerLibrosEditorial(editorial);
    }

    @GetMapping("/editorialAnioEspecifico")
    public List<?> obtenerLibrosEditorialAnio(){
        String editorial = "Planeta";
        Integer anio = 1986;
        return usuarioService.obtenerLibrosEditorialAnio(editorial, anio);
    }

}
