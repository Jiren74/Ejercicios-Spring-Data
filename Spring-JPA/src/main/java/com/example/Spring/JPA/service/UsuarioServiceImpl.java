package com.example.Spring.JPA.service;

import com.example.Spring.JPA.entity.*;
import com.example.Spring.JPA.repository.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.time.Year;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final AutorRepository autorRepository;
    private final EditorialRepository editorialRepository;
    private final FormatoRepository formatoRepository;
    private final HistoricoRepository historicoRepository;
    private final LibroRepository libroRepository;
    private final StockRepository stockRepository;
    private final TematicaRepository tematicaRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository, EditorialRepository editorialRepository,
                              FormatoRepository formatoRepository, HistoricoRepository historicoRepository,
                              LibroRepository libroRepository, StockRepository stockRepository,
                              TematicaRepository tematicaRepository, AutorRepository autorRepository) {
        this.usuarioRepository = usuarioRepository;
        this.editorialRepository = editorialRepository;
        this.formatoRepository = formatoRepository;
        this.historicoRepository = historicoRepository;
        this.libroRepository = libroRepository;
        this.stockRepository = stockRepository;
        this.tematicaRepository = tematicaRepository;
        this.autorRepository = autorRepository;
    }

    //Ejercicio 3: Consultas Por defecto.
    @Override
    public List<Usuario> findAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Transactional
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Métodos de Autor
    @Override
    public List<Autor> findAllAutores() {
        return autorRepository.findAll();
    }

    public Optional<Autor> findAllById(Long id) {
        return autorRepository.findById(id);
    }

    @Transactional
    public Autor saveAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    @Transactional
    public void deleteAutor(Long id) {
        autorRepository.deleteById(id);
    }

    //Métodos Editorial
    @Override
    public List<Editorial> findAllEditoriales() {
        return editorialRepository.findAll();
    }

    public Optional<Editorial> findAllEditorialById(Long id) {
        return editorialRepository.findById(id);
    }

    @Transactional
    public Editorial saveEditorial(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    @Transactional
    public void deleteEditorial(Long id) {
        editorialRepository.deleteById(id);
    }

    //Métodos Formato
    @Override
    public List<Formato> findAllFormato() {
        return formatoRepository.findAll();
    }

    public Optional<Formato> findAllFormatoById(Long id) {
        return formatoRepository.findById(id);
    }

    @Transactional
    public Formato saveFormato(Formato formato) {
        return formatoRepository.save(formato);
    }

    @Transactional
    public void deleteFormato(Long id) {
        formatoRepository.deleteById(id);
    }


    //Método Libro
    @Override
    public List<Libro> findAllLibro() {
        return libroRepository.findAll();
    }

    public Optional<Libro> findAllLibroById(Long id) {
        return libroRepository.findById(id);
    }

    @Transactional
    public Libro saveLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    @Transactional
    public void deleteLibro(Long id) {
        libroRepository.deleteById(id);
    }


    //Método stock
    @Override
    public List<Stock> findAllStock() {
        return stockRepository.findAll();
    }

    public Optional<Stock> findAllStockById(Long id) {
        return stockRepository.findById(id);
    }

    @Transactional
    public Stock saveStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Transactional
    public void deleteStock(Long id) {
        stockRepository.deleteById(id);
    }


    //Método Temática
    @Override
    public List<Tematica> findAllTematica() {
        return tematicaRepository.findAll();
    }

    public Optional<Tematica> findAllTematicaById(Long id) {
        return tematicaRepository.findById(id);
    }

    @Transactional
    public Tematica saveTematica(Tematica tematica) {
        return tematicaRepository.save(tematica);
    }

    @Transactional
    public void deleteTematica(Long id) {
        tematicaRepository.deleteById(id);
    }


    //Ejercicio 4
    @Override
    public List<?> obtenerLibrosPublicadosDespuesDeQuery(Date anioPublicacion) {
        return libroRepository.findLibrosPublicadosDespuesDe(anioPublicacion);
    }
    //Ejercicio 5
    @Override
    public List<?> obtenerLibrosPublicadosDespuesDeMetodo(Date anioPublicacion) {
        return libroRepository.findByAnioPublicacionAfter(anioPublicacion);
    }

    //Ejercicio 6

    @Override
    public List<?> obtenerLibrosPublicadosUnAnio(Integer anio) {
        return libroRepository.findLibrosPublicadosUnAnio(anio);
    }

    @Override
    public List<?> obtenerLibrosIsbn(String isbn) {
        return libroRepository.findLibrosIsbn(isbn);
    }

    @Override
    public List<?> obtenerLibrosEditorial(String editorial) {
        return libroRepository.findLibrosEditorial(editorial);
    }

    @Override
    public List<?> obtenerLibrosEditorialAnio(String editorial, Integer anio) {
        return libroRepository.findLibrosEditorialAnio(editorial, anio);
    }



}
