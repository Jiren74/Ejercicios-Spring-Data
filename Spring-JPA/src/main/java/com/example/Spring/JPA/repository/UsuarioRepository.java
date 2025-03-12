package com.example.Spring.JPA.repository;


import com.example.Spring.JPA.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
