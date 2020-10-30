package com.sportyshoesweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoesweb.model.Product;
import com.sportyshoesweb.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/{product_id}")
	public ResponseEntity<Product> getProductById(@PathVariable Integer product_id) {

		if (productService.getProductById(product_id) != null)
			return new ResponseEntity<>(productService.getProductById(product_id), HttpStatus.FOUND);

		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

	@GetMapping("")
	public List<Product> getAllProduct() {
		return productService.listAllProduct();
	}

	@PostMapping("/")
	public void saveProduct(@RequestBody Product product) {
		productService.saveProduct(product);
	}

	@PutMapping("/{product_id}")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable Integer product_id) {

		if (productService.getProductById(product_id) != null) {
			product.setProduct_id(product_id);
			productService.saveProduct(product);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(product, HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/{product_id}")
	public void deleteProduct(@PathVariable Integer product_id) {
		productService.deleteProductById(product_id);
	}

}
