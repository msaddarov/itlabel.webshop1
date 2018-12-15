package com.itlabel.project.webshop1.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.itlabel.project.webshop1.persistence.model.CartStatus;

public interface CartStatusRepository extends CrudRepository<CartStatus, Integer> {

}