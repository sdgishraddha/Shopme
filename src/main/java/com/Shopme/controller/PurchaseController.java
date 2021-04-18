package com.Shopme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Shopme.model.Purchase;
import com.Shopme.repository.PurchaseRepository;

@CrossOrigin
@RestController
@RequestMapping("/purchase")
public class PurchaseController {

	@Autowired
	PurchaseRepository purchaseRepository;

	@GetMapping("")
	public List<Purchase> listAllPurchase() {
		return purchaseRepository.findAll();
	}
	
	@PostMapping("/")
    public void commitPurchase(@RequestBody Purchase purchase) {
		purchaseRepository.save(purchase);
	}
}
