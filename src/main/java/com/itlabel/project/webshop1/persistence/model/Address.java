package com.itlabel.project.webshop1.persistence.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	public Address(){}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(nullable = false, unique = false, name = "country_code")
	private String countryCode;
	
	@Column(nullable = true, unique = false, name = "region")
	private String region;

	@Column(nullable = true, unique = false, name = "region2")
	private String region2;

	@Column(nullable = true, unique = false, name = "municipality")
	private String municipality;

	@Column(nullable = true, unique = false, name = "address_line")
	private String addressLine;

	@Column(nullable = true, unique = false, name = "address_line2")
	private String addressLine2;
	
	@Column(nullable = true, unique = false, name = "street")
	private String street;
	
	@Column(nullable = true, unique = false, name = "building_number")
	private String buildingNumber;
	
	@Column(nullable = true, unique = false, name = "unit")
	private String unit;
	
	@Column(nullable = true, unique = false, name = "post_office_box")
	private String postOfficeBox;
	
	@Column(nullable = true, unique = false, name = "latitude")
	private Integer latitude;
	
	@Column(nullable = true, unique = false, name = "longitude")
	private Integer longitude;
	
	@Column(nullable = true, unique = false, name = "valid_from")
	private LocalDateTime  validFrom;

	@Column(nullable = true, unique = false, name = "valid_to")
	private LocalDateTime  validTo;
	
	@Column(nullable = true, unique = false, name = "address_type_id")
	private Integer addressTypeID;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRegion2() {
		return region2;
	}

	public void setRegion2(String region2) {
		this.region2 = region2;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPostOfficeBox() {
		return postOfficeBox;
	}

	public void setPostOfficeBox(String postOfficeBox) {
		this.postOfficeBox = postOfficeBox;
	}

	public Integer getLatitude() {
		return latitude;
	}

	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}

	public Integer getLongitude() {
		return longitude;
	}

	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}

	public LocalDateTime getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(LocalDateTime validFrom) {
		this.validFrom = validFrom;
	}

	public LocalDateTime getValidTo() {
		return validTo;
	}

	public void setValidTo(LocalDateTime validTo) {
		this.validTo = validTo;
	}

	public Integer getAddressTypeID() {
		return addressTypeID;
	}

	public void setAddressTypeID(Integer addressTypeID) {
		this.addressTypeID = addressTypeID;
	}
	
}
