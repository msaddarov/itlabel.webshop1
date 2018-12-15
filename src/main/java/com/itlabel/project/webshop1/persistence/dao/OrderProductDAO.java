package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.OrderProduct;
import com.itlabel.project.webshop1.persistence.repository.OrderProductRepository;

@Component
public class OrderProductDAO 
{
	private OrderProductRepository repo;

	  @Autowired
	  public OrderProductDAO(OrderProductRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<OrderProduct> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
 