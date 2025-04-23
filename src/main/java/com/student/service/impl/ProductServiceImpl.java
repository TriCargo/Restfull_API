package com.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.student.dao.ProductDAO;
import com.student.entity.Product;
import com.student.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDAO dao;

    public List<Product> findAll() {
        return dao.findAll();
    }

    public Product findById(String id) {
        return dao.findById(id).get();
    }

    public Product create(Product product) {
        return dao.save(product);
    }

    public Product update(Product product) {
        return dao.save(product);
    }

    public void delete(String id) {
        dao.deleteById(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        return dao.findByNameContaining(name);
    }

    public List<Product> findAllWithPagination(int page, int limit) {
        PageRequest pageRequest = PageRequest.of(page - 1, limit);
        Page<Product> productPage = dao.findAll(pageRequest);
        return productPage.getContent();
    }
}