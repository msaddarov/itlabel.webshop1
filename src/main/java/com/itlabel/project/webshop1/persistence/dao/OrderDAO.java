package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.Order;
import com.itlabel.project.webshop1.persistence.repository.OrderRepository;

@Component
public class OrderDAO 
{
	private OrderRepository repo;

	  @Autowired
	  public OrderDAO(OrderRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<Order> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
