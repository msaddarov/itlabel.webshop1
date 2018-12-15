package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.CartStatus;
import com.itlabel.project.webshop1.persistence.repository.CartStatusRepository;

@Component
public class CartStatusDAO 
{
	private CartStatusRepository repo;

	  @Autowired
	  public CartStatusDAO(CartStatusRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<CartStatus> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
