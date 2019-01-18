package com.itlabel.project.webshop1.persistence.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itlabel.project.webshop1.persistence.model.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDAOTest {

    private static final Logger logger = LogManager.getLogger(ProductDAOTest.class);

	  @Autowired
	  private ProductDAO manager;
	
	  @Test
	  public void getAllReturnsDataFromDatabase()  
	  {
	    List<Product> products = manager.getAll().collect(Collectors.toList());
	    assertFalse(products.isEmpty());
	    assertEquals(4, products.size());
	
	    products.forEach(logger::info);
	  }
	  
	  
	  @Test
	  public void testFindByCategory()  
	  {
		  List<Product> products = manager.findByCategory("1");
		  
		  assertFalse(products.isEmpty());
		  assertEquals(2, products.size());	    
		  assertFalse(!"EL-UR-12-F1".equals(products.get(1).getSKU()));
		
	
	  }
}
