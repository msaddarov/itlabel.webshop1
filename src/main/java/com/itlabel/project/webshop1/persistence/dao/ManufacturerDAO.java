package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.Manufacturer;
import com.itlabel.project.webshop1.persistence.repository.ManufacturerRepository;

@Component
public class ManufacturerDAO 
{
	private ManufacturerRepository repo;

	  @Autowired
	  public ManufacturerDAO(ManufacturerRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<Manufacturer> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
