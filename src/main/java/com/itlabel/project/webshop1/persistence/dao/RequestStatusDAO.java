package com.itlabel.project.webshop1.persistence.dao;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itlabel.project.webshop1.persistence.model.RequestStatus;
import com.itlabel.project.webshop1.persistence.repository.RequestStatusRepository;

@Component
public class RequestStatusDAO 
{
	private RequestStatusRepository repo;

	  @Autowired
	  public RequestStatusDAO(RequestStatusRepository repo) {
	    this.repo = repo;
	  }

	  public Stream<RequestStatus> getAll() {
	    return StreamSupport.stream(repo.findAll().spliterator(), true);
	  }
}
