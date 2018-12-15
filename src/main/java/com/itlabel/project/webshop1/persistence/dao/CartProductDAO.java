package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.CartProduct;
import com.itlabel.project.webshop1.persistence.repository.CartProductRepository;

@Component
public class CartProductDAO 
{
	private CartProductRepository repo;

	  @Autowired
	  public CartProductDAO(CartProductRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<CartProduct> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
