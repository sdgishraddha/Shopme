package com.sportyshoesweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoesweb.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
