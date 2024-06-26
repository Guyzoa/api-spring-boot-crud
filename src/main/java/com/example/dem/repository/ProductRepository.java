package com.example.dem.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.dem.model.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    
}
