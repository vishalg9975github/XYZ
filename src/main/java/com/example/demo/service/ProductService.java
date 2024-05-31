package com.example.demo.service;

import com.example.demo.model.Product;

public interface ProductService {

	// API to save product details in DB
	public Product addProductDetails(Product product);

	// API to fetch product details from DB
	public Product getProductDetails(Integer id);

}
