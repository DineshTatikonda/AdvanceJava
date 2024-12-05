package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Product;
import com.example.repository.ProductRepository;
@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	public Product save(Product product) {
		return repository.save(product);
	}
	public Product findByID(int i) {
		return repository.findById(i).get();
	}
	
}
