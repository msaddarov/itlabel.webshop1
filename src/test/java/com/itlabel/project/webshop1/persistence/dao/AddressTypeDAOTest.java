package com.itlabel.project.webshop1.persistence.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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

import com.itlabel.project.webshop1.persistence.model.AddressType;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressTypeDAOTest {

	 private static final Logger logger = LogManager.getLogger(AddressTypeDAOTest.class);
	 
	  @Autowired
	  private AddressTypeDAO manager;
	
	  @Test
	  public void getAllReturnsDataFromDatabase()  
	  {
	    List<AddressType> objects = manager.getAll().collect(Collectors.toList());
	    
	    assertFalse(objects.isEmpty());
	    
	    assertEquals(4, objects.size());
	    	    
	    String[] types = {"billing", "home", "work", "delivery"};
	    
	    assertEquals(objects.stream()
	      .filter(obj -> Arrays.asList(types).contains(obj.getName()))
	      .count(), 4);
	  }
}

