package com.Shopme.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_table")
public class Purchase {

	private Integer purchaseId;

//	@Column(name = "purchaseDate")
	private LocalDateTime purchaseDate;

//	@Column(name = "productId")
	private Integer productId;

 //	@Column(name = "userEmail")
	private String userEmail;

   // @Column(name = "paidAmount")
	private Float paidAmount;

	public Purchase() {
		super();
	}

	public Purchase(Integer purchaseId, LocalDateTime purchaseDate, Integer productId, String userEmail,
			Float paidAmount) {
		super();
		this.purchaseId = purchaseId;
		this.purchaseDate = purchaseDate;
		this.productId = productId;
		this.userEmail = userEmail;
		this.paidAmount = paidAmount;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public LocalDateTime getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDateTime purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Float getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Float paidAmount) {
		this.paidAmount = paidAmount;
	}

}
