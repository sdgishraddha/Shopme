package com.Shopme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Shopme.model.Purchase;
import com.Shopme.repository.PurchaseRepository;

@Service
@Transactional
public class PurchaseService {

	@Autowired
	PurchaseRepository purchaseRepository;

	public List<Purchase> listAllPurchase() {
		return purchaseRepository.findAll();
	}

	public void commitPurchase(Purchase purchase) {
		purchaseRepository.save(purchase);
	}

}
