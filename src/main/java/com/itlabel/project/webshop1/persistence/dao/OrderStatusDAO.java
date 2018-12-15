package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.OrderStatus;
import com.itlabel.project.webshop1.persistence.repository.OrderStatusRepository;

@Component
public class OrderStatusDAO 
{
	private OrderStatusRepository repo;

	  @Autowired
	  public OrderStatusDAO(OrderStatusRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<OrderStatus> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
