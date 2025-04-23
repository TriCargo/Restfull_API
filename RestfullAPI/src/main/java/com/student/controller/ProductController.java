package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.entity.Product;
import com.student.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	@RequestMapping("/product/list")
	public String list(Model model, @RequestParam("cid") Optional<String> cid) {
	    List<Product> list = productService.findAll();
	    model.addAttribute("items", list);
	    if (!model.containsAttribute("product")) {
	        model.addAttribute("product", new Product());
	    }

	    return "product/list";
	}

	@RequestMapping("/product/edit")
	public String edit(Model model, @RequestParam("id") String id) {
	    Product product = productService.findById(id);
	    model.addAttribute("product", product);
	    model.addAttribute("items", productService.findAll());
	    return "product/list";
	}


	@RequestMapping("/product/delete")
	public String delete(@RequestParam("id") String id) {
	    productService.delete(id);
	    return "redirect:/product/list";
	}

	@RequestMapping("/product/save")
	public String save(Product product) {
	    productService.create(product);
	    return "redirect:/product/list";
	}

}