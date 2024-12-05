package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.controller.ProductController;
import com.example.model.Product;

@SpringBootApplication
public class SpringDataJpaExample1Application {

	public static void main(String[] args) {
	  ApplicationContext context=SpringApplication.run(SpringDataJpaExample1Application.class, args);
	  ProductController controller=context.getBean(ProductController.class);
	  
	  Product product=new Product();
	  product.setName("Vivo Mobile");
	  product.setPrice(4000.00);
	  controller.save(product);
	  
//	  Product product=controller.findByID(1);
//	  System.out.println(product);
//	 
	}

}
