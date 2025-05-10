package com.apibazzar.ecomm.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apibazzar.ecomm.application.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}
