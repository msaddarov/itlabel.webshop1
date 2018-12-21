package com.itlabel.project.webshop1.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itlabel.project.webshop1.persistence.dao.ProductDAO;
import com.itlabel.project.webshop1.persistence.model.Product;

@Controller
public class ProductsController 
{

	  @Autowired
	  private ProductDAO productsManager;
	
	@RequestMapping("/")
	public ModelAndView index() {
		 return new ModelAndView("index", new HashMap<>());
	}
	
	@RequestMapping("/products")
	public ModelAndView products(Model model) 
	{
		List<Product> products = productsManager.getAll().collect(Collectors.toList());
		
	    Map<String, Object> params = new HashMap<>();
        params.put("products", products);
	   
       return new ModelAndView("products", params);

	}
	
	@RequestMapping("/johnybaba/order")
	public ModelAndView baba1(Model model) 
	{        
       return new ModelAndView("johnybaba/order", new HashMap<>());
	}
	
	@RequestMapping("/johnybaba/product_details")
	public ModelAndView baba2(Model model) 
	{        
       return new ModelAndView("johnybaba/product_details", new HashMap<>());
	}
	
	@RequestMapping("/johnybaba/products")
	public ModelAndView baba3(Model model) 
	{        
       return new ModelAndView("johnybaba/products", new HashMap<>());
	}
}
