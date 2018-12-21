package com.itlabel.project.webshop1.persistence.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itlabel.project.webshop1.persistence.model.ProductImage;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductImageDAOTest {

	 private static final Logger logger = LogManager.getLogger(ProductImageDAOTest.class);

	 private static final String IMAGE_STUB = "/static/products/stub.jpg";
	 
	  @Autowired
	  private ProductImageDAO manager;
	
	  @Test
	  public void getAllReturnsDataFromDatabase()  
	  {
	    List<ProductImage> objects = manager.getAll().collect(Collectors.toList());
	    
	    assertFalse(objects.isEmpty());
	    assertEquals(4, objects.size());
	    assertTrue(IMAGE_STUB.equals(objects.get(0).getImage()));
	    
	    //objects.forEach(logger::info);
	  }
}
