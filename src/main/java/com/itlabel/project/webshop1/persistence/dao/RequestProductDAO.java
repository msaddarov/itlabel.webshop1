package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.RequestProduct;
import com.itlabel.project.webshop1.persistence.repository.RequestProductRepository;

@Component
public class RequestProductDAO 
{
	private RequestProductRepository repo;

	  @Autowired
	  public RequestProductDAO(RequestProductRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<RequestProduct> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
