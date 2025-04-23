package com.student.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Product;

public interface ProductDAO extends JpaRepository<Product, String> {

	List<Product> findByNameContaining(String name);
}
