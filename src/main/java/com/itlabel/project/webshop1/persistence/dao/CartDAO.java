package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.Cart;
import com.itlabel.project.webshop1.persistence.repository.CartRepository;

@Component
public class CartDAO 
{
	private CartRepository repo;

	  @Autowired
	  public CartDAO(CartRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<Cart> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
