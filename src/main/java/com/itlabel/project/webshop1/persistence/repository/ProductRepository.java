package com.itlabel.project.webshop1.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.itlabel.project.webshop1.persistence.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}