package com.itlabel.project.webshop1.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.itlabel.project.webshop1.persistence.model.OrderProduct;

public interface OrderProductRepository extends CrudRepository<OrderProduct, Integer> {

}