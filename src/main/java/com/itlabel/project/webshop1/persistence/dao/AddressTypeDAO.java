package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.AddressType;
import com.itlabel.project.webshop1.persistence.repository.AddressTypeRepository;

@Component
public class AddressTypeDAO 
{
	private AddressTypeRepository repo;

	  @Autowired
	  public AddressTypeDAO(AddressTypeRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<AddressType> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
