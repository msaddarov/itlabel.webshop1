package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.Product;
import com.itlabel.project.webshop1.persistence.repository.ProductRepository;

@Component
public class ProductDAO 
{
	private ProductRepository repo;

	  @Autowired
	  public ProductDAO(ProductRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<Product> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
