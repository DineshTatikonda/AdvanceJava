package com.rest.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rest.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	public List<Product> findByCategory(String category);
	

}
