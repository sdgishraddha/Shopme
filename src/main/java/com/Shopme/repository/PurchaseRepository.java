package com.Shopme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Shopme.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

}
