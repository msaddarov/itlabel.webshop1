package com.itlabel.project.webshop1.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.itlabel.project.webshop1.persistence.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> 
{

	@Query("select u from Product u where u.id in (select productID from ProductCategoryLink pc where pc.categoryID = ?1)")
	List<Product> findByCategoryID(Integer categoryID);

}