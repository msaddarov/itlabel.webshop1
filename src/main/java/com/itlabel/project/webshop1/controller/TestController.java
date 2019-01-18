package com.itlabel.project.webshop1.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itlabel.project.webshop1.persistence.dao.ProductDAO;
import com.itlabel.project.webshop1.persistence.model.Product;

@Controller
public class TestController 
{

	@Autowired
	private ProductDAO productsManager;
	
	@RequestMapping("/test/products")
	public ModelAndView productsByCategoryID(@RequestParam("categoryID") String categoryID) 
	{
		
		List<Product> products = productsManager.findByCategory(categoryID);
		
		Map<String, Object> params = new HashMap<>();
		params.put("products", products);
			   
		return new ModelAndView("products", params);
	}
	
}
