package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.Customer;
import com.itlabel.project.webshop1.persistence.repository.CustomerRepository;

@Component
public class CustomerDAO 
{
	private CustomerRepository repo;

	  @Autowired
	  public CustomerDAO(CustomerRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<Customer> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
