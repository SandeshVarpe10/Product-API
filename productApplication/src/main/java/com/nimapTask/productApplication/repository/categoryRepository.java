package com.nimapTask.productApplication.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nimapTask.productApplication.entity.Category;
import com.nimapTask.productApplication.entity.Product;

import java.util.*;

public interface categoryRepository extends JpaRepository<Category, Integer>{
	Page<Category> findAll(Pageable pageable);
	public Category findById(int id);
	public Category save(Category c);
}
