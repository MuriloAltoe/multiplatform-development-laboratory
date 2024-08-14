package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.Optional;

import com.example.demo.domain.entitlies.ProductEntity;
import com.example.demo.domain.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductEntity findById(Integer id){
        Optional<ProductEntity> optional = repository.findById(id);
        if (optional.isPresent())return optional.get();
        return null;        
    }
}
