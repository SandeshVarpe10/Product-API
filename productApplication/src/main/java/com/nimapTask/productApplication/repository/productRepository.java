package com.nimapTask.productApplication.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nimapTask.productApplication.entity.Product;

public interface productRepository extends JpaRepository<Product, Integer>{
	public List<Product> findAll();
	public Product findById(int id);
	public Product save(Product p);
}
