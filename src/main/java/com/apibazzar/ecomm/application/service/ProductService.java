package com.apibazzar.ecomm.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apibazzar.ecomm.application.model.Product;
import com.apibazzar.ecomm.application.repository.ProductRepository;

@Service
public class ProductService {

 @Autowired
 private ProductRepository repository;

 public Product addProduct(Product product) {
     return repository.save(product);
 }
}
