package com.rest.controller;
import java.util.List;import javax.net.ssl.HttpsURLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Product;
import com.rest.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	@PostMapping("/save")
	public ResponseEntity<?> saveProduct(@RequestBody  Product product){
	Product response=service.save(product);
	if(response!= null) {
		return new ResponseEntity<>(response,HttpStatus.OK);	
	}
	else {
		return new ResponseEntity<>("Product not added",HttpStatus.BAD_REQUEST);
	}
			}
	@GetMapping("/findById/{id}")
	public ResponseEntity<?>getProductById(@PathVariable Integer id){
       Product product=service.findById(id);
       if(product.getId()!=0) {
    	   return new ResponseEntity<>(product,HttpStatus.FOUND);
    	   
       }
       else {
    	   return new ResponseEntity<>("Invalid product id",HttpStatus.NOT_FOUND);
       }
	}
	@GetMapping("/findAll")
	public ResponseEntity<?>getAllProducts(){
	List<Product> products=	service.findAll();
	if(products.size()>0) {
        return new ResponseEntity<>(products,HttpStatus.FOUND);		
	}
	else {
		return new ResponseEntity<>("No Products",HttpStatus.NOT_FOUND);
	}	
		
	}
	@PutMapping("/update")
	public ResponseEntity<?> updateProduct(@RequestBody Product  product){
		Product response=service.update(product);
		if(response !=null) {
			return new ResponseEntity<>(response,HttpStatus.OK);
			}
		else {
			return new ResponseEntity<>("Product  Not Updated",HttpStatus.BAD_REQUEST);
		}	
	}
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<?>deleteProduct(@PathVariable Integer id){
		Product product=service.findById(id);
		if(product.getId() ==0) {
			return new ResponseEntity<>("Invalid productid",HttpStatus.BAD_REQUEST); 
			
		}
		else {
			service.deleteById(id);
			return new ResponseEntity<>("product delete successfully",HttpStatus.OK);
			
		}
	}
	@GetMapping("/findByCategory/{category}")
	public ResponseEntity<?>getProductByCategory(@PathVariable String category){
       List<Product> products=service.findByCategory(category);
       if(products.size()==0) {
    	   return new ResponseEntity<>("no products founds",HttpStatus.NOT_FOUND);
    	   
       }
       else {
    	   return new ResponseEntity<>(products,HttpStatus.FOUND);
       }
	}
		
}

