package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.Product;
import com.itlabel.project.webshop1.persistence.repository.ProductImageRepository;

@Component
public class ProductImageDAO 
{
	private ProductImageRepository repo;

	  @Autowired
	  public ProductImageDAO(ProductImageRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<Product> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
