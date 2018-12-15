package com.itlabel.project.webshop1.persistence.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itlabel.project.webshop1.persistence.dao.ProductDAO;
import com.itlabel.project.webshop1.persistence.model.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDAOTests {

	
	  @Autowired
	  private ProductDAO manager;
	
	  @Test
	  public void getAllReturnsDataFromDatabase()  
	  {
	    List<Product> products = manager.getAll().collect(Collectors.toList());
	    assertFalse(products.isEmpty());
	    assertEquals(4, products.size());
	
	    products.forEach(System.out::println);
	  }
}
