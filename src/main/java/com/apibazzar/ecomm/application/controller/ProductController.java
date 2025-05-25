package com.apibazzar.ecomm.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apibazzar.ecomm.application.dto.ProductUpdateRequest;
import com.apibazzar.ecomm.application.model.Product;
import com.apibazzar.ecomm.application.service.ProductService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/ecomm/v1/stocks")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	@Operation(summary = "Add a new product", description = "Stores a product with details")
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	@Operation(summary = "Update a product", description = "Update a product details by Id")
	@PutMapping("/update/{productId}")
	public Product updateProductDetails(@PathVariable String productId, @RequestBody ProductUpdateRequest request) {
		return productService.updateProductDetails(productId, request);
	}
	
	@Operation(summary = "Get a product", description = "Get a product details by Id")
	@GetMapping("/{productId}")
	public Product getProductById(@PathVariable String productId) {
	    return productService.getProductById(productId);
	}
	
	@Operation(summary = "Delete a product", description = "Delete a product by Id")
	@DeleteMapping("/delete/{productId}")
	public String deleteProduct(@PathVariable String productId) {
	    return productService.deleteProduct(productId);
	}


}