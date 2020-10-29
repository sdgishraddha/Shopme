package com.sportyshoesweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sportyshoesweb.model.Product;
import com.sportyshoesweb.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public List<Product> listAllProduct() {
		return productRepository.findAll();
	}

	public void saveProduct(Product product) {
		productRepository.save(product);
	}

	public Product getProductById(Integer product_id) {

		if (productRepository.findById(product_id).isPresent()) {
			Product product = productRepository.findById(product_id).get();
			return product;
		}

		return null;
	}

	public void deleteProductById(Integer product_id) {
		productRepository.deleteById(product_id);
	}

}