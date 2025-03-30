package com.nimapTask.productApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.nimapTask.productApplication.entity.Product;
import com.nimapTask.productApplication.repository.productRepository;

@RestController
@RequestMapping("/api")
public class productController {
	@Autowired
	productRepository pr;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return pr.findAll();
	}
	
	@PostMapping("/products/add")
	public void addProduct(@RequestBody Product p) {
		pr.save(p);
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable int id) {
		return pr.findById(id);
	}
	
	@PutMapping("/products/{id}")
	public Product updateProduct(@PathVariable int id) {
		Product p=pr.findById(id);
		p.setPrice(300);
		pr.save(p);
		return p;
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable int id) {
		Product p=pr.findById(id);
		pr.delete(p);
	}
}

