package com.itlabel.project.webshop1.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "request_product")
public class RequestProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(nullable = false, unique = false, name = "product_id")
	private Integer productID;
	
	@Column(nullable = false, unique = false, name = "request_id")
	private Integer requestID;
	
	@Column(nullable = false, unique = false, name = "quantity")
	private Integer quantity;

	@Column(nullable = false, unique = false, name = "price")
	private Double price;
	
	@Column(nullable = false, unique = false, name = "currency")
	private String currency;
	
	
	 protected RequestProduct() {
		    // for JPA
	 }


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getProductID() {
		return productID;
	}


	public void setProductID(Integer productID) {
		this.productID = productID;
	}


	public Integer getRequestID() {
		return requestID;
	}


	public void setRequestID(Integer requestID) {
		this.requestID = requestID;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}
	 
	 

}
