package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.ProductCategory;
import com.itlabel.project.webshop1.persistence.repository.ProductCategoryRepository;

@Component
public class ProductCategoryDAO 
{
	private ProductCategoryRepository repo;

	  @Autowired
	  public ProductCategoryDAO(ProductCategoryRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<ProductCategory> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
