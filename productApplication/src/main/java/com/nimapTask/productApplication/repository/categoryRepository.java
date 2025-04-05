package com.nimapTask.productApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nimapTask.productApplication.entity.Category;

import java.util.*;

public interface categoryRepository extends JpaRepository<Category, Integer>{
	List<Category> findAll();
	public Category findById(int id);
	public Category save(Category c);
}
