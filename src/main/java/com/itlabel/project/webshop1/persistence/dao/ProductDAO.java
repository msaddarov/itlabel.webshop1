package com.itlabel.project.webshop1.persistence.dao;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.h2.util.StringUtils;
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
	  
	  
	  public List<Product> findByCategory(String sCategoryID) {
		  
		  if (!StringUtils.isNumber(sCategoryID))
			  throw new IllegalArgumentException("[" + sCategoryID + "] category ID is not a number.");
		  
		  return repo.findByCategoryID(Integer.valueOf(sCategoryID));
	  }
}
