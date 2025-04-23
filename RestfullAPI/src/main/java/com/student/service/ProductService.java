package com.student.service;

import java.util.List;

import com.student.entity.Product;

public interface ProductService {
	public List<Product> findAll() ;
	
	public Product findById(String id) ;

	public Product create(Product product) ;

	public Product update(Product product) ;

	public void delete(String id) ;

	List<Product> searchByName(String name);

	public List<Product> findAllWithPagination(int page, int limit);
}
