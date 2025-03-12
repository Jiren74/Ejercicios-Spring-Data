package com.example.Spring.JPA.repository;

import com.example.Spring.JPA.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    public Usuario findByEmail(String email);
}
