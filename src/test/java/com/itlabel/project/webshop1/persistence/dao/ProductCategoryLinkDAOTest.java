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

import com.itlabel.project.webshop1.persistence.model.ProductCategoryLink;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryLinkDAOTest {

	 private static final Logger logger = LogManager.getLogger(ProductCategoryLinkDAOTest.class);
	 
	  @Autowired
	  private ProductCategoryLinkDAO manager;
	
	  @Test
	  public void getAllReturnsDataFromDatabase()  
	  {
	    List<ProductCategoryLink> objects = manager.getAll().collect(Collectors.toList());
	    
	    assertFalse(objects.isEmpty());
	    
	    assertEquals(4, objects.size());

	    
	  }
}
