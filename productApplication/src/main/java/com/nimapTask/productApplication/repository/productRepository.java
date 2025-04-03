package com.nimapTask.productApplication.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nimapTask.productApplication.entity.Product;

public interface productRepository extends JpaRepository<Product, Integer>{
	Page<Product> findAll(Pageable pageable);
	public Product findById(int id);
	public Product save(Product p);
}
