package com.itlabel.project.webshop1.persistence.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(nullable = false, unique = true, name = "name")
	private String name;

	@Column(nullable = false, unique = true, name = "sku")
	private String SKU;
	
	@Column(nullable = true, unique = false, name = "description")
	private String description;
	
	@Column(nullable = true, unique = false, name = "price")
	private Double price;
	
	@Column(nullable = true, unique = false, name = "stock")
	private Double stock;

	@Column(nullable = false, unique = false, name = "created_at")
	private LocalDateTime createdAt;

	@Column(nullable = false, unique = false, name = "updated_at")
	private LocalDateTime updatedAt;
	
	@Column(nullable = true, unique = false, name = "currency")
	private String currency;
	
	@Column(nullable = true, unique = false, name = "manufacturer_id")
	private Integer manufacturerID;
	
	
	 protected Product() {
		    // for JPA
	 }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String sKU) {
		SKU = sKU;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getStock() {
		return stock;
	}

	public void setStock(Double stock) {
		this.stock = stock;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getManufacturerID() {
		return manufacturerID;
	}

	public void setManufacturerID(Integer manufacturerID) {
		this.manufacturerID = manufacturerID;
	}

	
}
