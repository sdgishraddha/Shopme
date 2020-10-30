package com.sportyshoesweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoesweb.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

}
