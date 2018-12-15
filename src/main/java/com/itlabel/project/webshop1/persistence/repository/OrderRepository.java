package com.itlabel.project.webshop1.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.itlabel.project.webshop1.persistence.model.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}