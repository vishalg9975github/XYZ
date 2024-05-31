package com.example.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Override
	public Product addProductDetails(Product product) {
		logger.info("In ProductServiceImpl save details method");
		return productRepository.save(product);

	}

	@Override
	public Product getProductDetails(Integer id) {
		logger.info("In ProductServiceImpl save details method");
		return productRepository.findById(id).get();
	}

}
