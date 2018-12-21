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

import com.itlabel.project.webshop1.persistence.model.RequestProduct;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RequestProductDAOTest {

	 private static final Logger logger = LogManager.getLogger(RequestProductDAOTest.class);
	 
	  @Autowired
	  private RequestProductDAO manager;
	
	  @Test
	  public void getAllReturnsDataFromDatabase()  
	  {
	    List<RequestProduct> objects = manager.getAll().collect(Collectors.toList());
	    
	    assertFalse(objects.isEmpty());
	    
	    assertEquals(1, objects.size());
	    	    
	 
	  }
}
