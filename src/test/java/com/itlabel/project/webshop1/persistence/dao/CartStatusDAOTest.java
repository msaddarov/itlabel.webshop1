package com.itlabel.project.webshop1.persistence.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itlabel.project.webshop1.persistence.model.Address;
import com.itlabel.project.webshop1.persistence.model.CartStatus;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartStatusDAOTest {

	 private static final Logger logger = LogManager.getLogger(CartStatusDAOTest.class);
	 
	  @Autowired
	  private CartStatusDAO manager;
	
	  @Test
	  public void getAllReturnsDataFromDatabase()  
	  {
	    List<CartStatus> objects = manager.getAll().collect(Collectors.toList());
	    
	    assertFalse(objects.isEmpty());
	    
	    assertEquals(3, objects.size());
	    	    
//	    String[] statuses = {"initialized", "ordered", "archived"};
	    
	   
//	    assertEquals(objects.stream()
//	      .filter(obj -> Arrays.asList(statuses).contains(obj.getName()))
//	      .count(), 4);
	    
	  }
}
