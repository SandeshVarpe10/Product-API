package com.nimapTask.productApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nimapTask.productApplication.entity.Category;
import com.nimapTask.productApplication.repository.categoryRepository;

@RestController
@RequestMapping("/api")
public class categoryController {
	@Autowired
	categoryRepository cr;
	
	@GetMapping("/categories")
	public List<Category> getAllCategories() {
        return cr.findAll();
    }
	
	@GetMapping("/category/{id}")
	public Category getCategoryById(@PathVariable int id){
		return cr.findById(id);
	}
	
	@PostMapping("/category/add")
	public void addCategory(@RequestBody Category c) {
		cr.save(c);
	}
	
	@PutMapping("/category/{id}")
	public Category updateCategory(@PathVariable int id) {
		Category c=cr.findById(id);
		c.setName("clothing");
		cr.save(c);
		return c;
	}
	
	@DeleteMapping("/category/{id}")
	public void deleteCategory(@PathVariable int id) {
		Category c=cr.findById(id);
		cr.delete(c);
	}
	
}

