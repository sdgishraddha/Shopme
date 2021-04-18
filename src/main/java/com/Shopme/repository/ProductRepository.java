package com.Shopme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Shopme.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
