package com.rest.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Product;
import com.rest.repo.ProductRepository;
@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	public Product save(Product product) {
		return repository.save(product);
	}

	public Product findById(Integer id) {
		return repository.findById(id).orElseGet(()->new Product());
	}

	public List<Product> findAll() {
      return repository.findAll();
	}

	public Product update(Product product) {
          return repository.save(product);
	}

	public void deleteById(Integer id) {
       repository.deleteById(id);
		
	}

	public List<Product> findByCategory(String category) {
     	return repository.findByCategory(category);
	}

}
