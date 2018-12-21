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

import com.itlabel.project.webshop1.persistence.model.Address;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressDAOTest {

	 private static final Logger logger = LogManager.getLogger(AddressDAOTest.class);
	 
	  @Autowired
	  private AddressDAO manager;
	
	  @Test
	  public void getAllReturnsDataFromDatabase()  
	  {
	    List<Address> objects = manager.getAll().collect(Collectors.toList());
	    
	    assertFalse(objects.isEmpty());
	    
	    assertEquals(3, objects.size());
	    	    
	    Address obj = objects.get(0);
	    
	    assertTrue("USA".equals(obj.getCountryCode()));
	    assertTrue("CA".equals(obj.getRegion()));
	    assertTrue(null == obj.getRegion2());
	    assertTrue("Irvine".equals(obj.getMunicipality()));
	    assertTrue("10th Street".equals(obj.getStreet()));
	    assertTrue("92618".equals(obj.getPostOfficeBox()));
	    
	  }
}
