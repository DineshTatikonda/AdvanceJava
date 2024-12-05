package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.model.Product;
import com.example.service.ProductService;

@Controller
public class ProductController {
	@Autowired
    private ProductService service;
	public Product save(Product product) {
        return service.save(product);		
	}
	public Product findByID(int i) {
		return service.findByID(1);
	}
//	public Product DeleteByID(int i) {
//		return service.DeleteByID(1);
//	}
	

}
