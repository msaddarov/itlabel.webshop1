package com.itlabel.project.webshop1.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.itlabel.project.webshop1.persistence.model.ProductCategory;

public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer> {

}