package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.Address;
import com.itlabel.project.webshop1.persistence.repository.AddressRepository;

@Component
public class AddressDAO 
{
	private AddressRepository repo;

	  @Autowired
	  public AddressDAO(AddressRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<Address> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
