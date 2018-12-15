package com.itlabel.project.webshop1.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.itlabel.project.webshop1.persistence.model.ProductCategory;
import com.itlabel.project.webshop1.persistence.model.ProductCategoryLink;

public interface ProductCategoryLinkRepository extends CrudRepository<ProductCategoryLink, Integer> {

}