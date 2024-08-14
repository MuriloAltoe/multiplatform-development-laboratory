package com.example.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.entitlies.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    
}
