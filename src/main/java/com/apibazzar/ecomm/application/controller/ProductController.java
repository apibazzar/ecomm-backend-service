package com.apibazzar.ecomm.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apibazzar.ecomm.application.dto.ProductUpdateRequest;
import com.apibazzar.ecomm.application.model.Product;
import com.apibazzar.ecomm.application.service.ProductService;

@RestController
@RequestMapping("/ecomm/v1/stocks")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	// ProductController.java
	@PutMapping("/update/{productId}")
	public Product updateProductDetails(@PathVariable String productId, @RequestBody ProductUpdateRequest request) {
		return productService.updateProductDetails(productId, request);
	}

}