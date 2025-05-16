package com.apibazzar.ecomm.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apibazzar.ecomm.application.dto.ProductUpdateRequest;
import com.apibazzar.ecomm.application.model.Product;
import com.apibazzar.ecomm.application.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public Product addProduct(Product product) {
		return repository.save(product);
	}

	public Product updateProductDetails(String productId, ProductUpdateRequest request) {
	    Product product = repository.findById(productId)
	        .orElseThrow(() -> new RuntimeException("Product not found with ID: " + productId));

	    product.setProductName(request.getProductName());
	    product.setProductType(request.getProductType());
	    product.setProductActualPrice(request.getProductActualPrice());
	    product.setProductSellingPrice(request.getProductSellingPrice());
	    product.setProductGST(request.getProductGST());

	    return repository.save(product);
	}
	
	public Product getProductById(String productId) {
	    return repository.findById(productId)
	            .orElseThrow(() -> new RuntimeException("Product not found with ID: " + productId));
	}
	
	public String deleteProduct(String productId) {
	    Product product = repository.findById(productId)
	            .orElseThrow(() -> new RuntimeException("Product not found with ID: " + productId));
	    repository.delete(product);
	    return "Product with ID " + productId + " has been deleted successfully.";
	}


}
