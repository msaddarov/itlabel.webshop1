package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.ProductCategoryLink;
import com.itlabel.project.webshop1.persistence.repository.ProductCategoryLinkRepository;

@Component
public class ProductCategoryLinkDAO 
{
	private ProductCategoryLinkRepository repo;

	  @Autowired
	  public ProductCategoryLinkDAO(ProductCategoryLinkRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<ProductCategoryLink> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
