package com.itlabel.project.webshop1.persistence.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(nullable = false, unique = false, name = "gender")
	private String gender;
	
	@Column(nullable = false, unique = false, name = "first_name")
	private String firstName;
	
	@Column(nullable = true, unique = false, name = "middle_name")
	private String middleName;
	
	@Column(nullable = false, unique = false, name = "last_name")
	private String lastName;
	
	@Column(nullable = true, unique = false, name = "DOB")
	private Date DOB;
	 
	@Column(nullable = false, unique = false, name = "email")
	private String email;
	
	@Column(nullable = false, unique = false, name = "phone")
	private String phone;	
	
	@Column(nullable = false, unique = false, name = "fax")
	private String fax;	
	
	
	@Column(nullable = false, unique = false, name = "login")
	private String login;	
	
	
	@Column(nullable = false, unique = false, name = "pass")
	private String pass;	
	
	
	 protected Customer() {
		    // for JPA
		  }


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDOB() {
		return DOB;
	}


	public void setDOB(Date DOB) {
		this.DOB = DOB;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}
}