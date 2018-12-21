package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.Request;
import com.itlabel.project.webshop1.persistence.repository.RequestRepository;

@Component
public class RequestDAO 
{
	private RequestRepository repo;

	  @Autowired
	  public RequestDAO(RequestRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<Request> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
