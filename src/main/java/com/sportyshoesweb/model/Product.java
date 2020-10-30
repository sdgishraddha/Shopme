package com.sportyshoesweb.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_table")
public class Product {

	private Integer product_id = 100;
	private String product_name;
	private String product_description;
	private String product_vendor;
	private Boolean in_stock;
	private Double product_cost;
	private String product_category;
	private LocalDateTime created_at;
	private LocalDateTime updated_at;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getProduct_id() {
		return product_id;
	}


	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public String getProduct_vendor() {
		return product_vendor;
	}

	public void setProduct_vendor(String product_vendor) {
		this.product_vendor = product_vendor;
	}

	public Boolean getIn_stock() {
		return in_stock;
	}

	public void setIn_stock(Boolean in_stock) {
		this.in_stock = in_stock;
	}

	public Double getProduct_cost() {
		return product_cost;
	}

	public void setProduct_cost(Double product_cost) {
		this.product_cost = product_cost;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}
	

	public Product() {
		super();
	}

	public Product(Integer product_id, String product_name, String product_description, String product_vendor,
			Boolean in_stock, Double product_cost, String product_category, LocalDateTime created_at,
			LocalDateTime updated_at) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.product_vendor = product_vendor;
		this.in_stock = in_stock;
		this.product_cost = product_cost;
		this.product_category = product_category;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

}
