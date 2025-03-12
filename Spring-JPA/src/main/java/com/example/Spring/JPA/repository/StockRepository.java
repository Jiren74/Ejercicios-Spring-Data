package com.example.Spring.JPA.repository;


import com.example.Spring.JPA.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
