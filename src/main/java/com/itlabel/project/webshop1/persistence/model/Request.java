package com.itlabel.project.webshop1.persistence.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "request")
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(nullable = false, unique = false, name = "customer_id")
	private Integer customerID;


	@Column(nullable = true, unique = false, name = "reference")
	private String reference;
	

	@Column(nullable = false, unique = false, name = "billing_name")
	private String billingName;
	

	@Column(nullable = false, unique = false, name = "delivery_name")
	private String deliveryName;
	

	@Column(nullable = false, unique = false, name = "billing_address_id")
	private Integer billingAddressID;
	

	@Column(nullable = false, unique = false, name = "purchase_date")
	private LocalDateTime purchaseDate;
	

	@Column(nullable = false, unique = false, name = "request_status_id")
	private Integer requestStatusID;
	

	@Column(nullable = false, unique = false, name = "delivery_address_id")
	private Integer deliveryAddressID;
	
	
	
	 protected Request() {
		    // for JPA
	 }



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getCustomerID() {
		return customerID;
	}



	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}



	public String getReference() {
		return reference;
	}



	public void setReference(String reference) {
		this.reference = reference;
	}



	public String getBillingName() {
		return billingName;
	}



	public void setBillingName(String billingName) {
		this.billingName = billingName;
	}



	public String getDeliveryName() {
		return deliveryName;
	}



	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}



	public Integer getBillingAddressID() {
		return billingAddressID;
	}



	public void setBillingAddressID(Integer billingAddressID) {
		this.billingAddressID = billingAddressID;
	}



	public LocalDateTime getPurchaseDate() {
		return purchaseDate;
	}



	public void setPurchaseDate(LocalDateTime purchaseDate) {
		this.purchaseDate = purchaseDate;
	}



	public Integer getRequestStatusID() {
		return requestStatusID;
	}



	public void setRequestStatusID(Integer requestStatusID) {
		this.requestStatusID = requestStatusID;
	}



	public Integer getDeliveryAddressID() {
		return deliveryAddressID;
	}



	public void setDeliveryAddressID(Integer deliveryAddressID) {
		this.deliveryAddressID = deliveryAddressID;
	}
	 
	 
  
}
