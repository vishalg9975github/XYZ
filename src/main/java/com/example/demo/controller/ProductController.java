package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	@PostMapping("/saveproduct")
	public ResponseEntity<Product> addProductDetails(@RequestBody Product product) {
		logger.info("In the product controller,save method");
		Product pr = productService.addProductDetails(product);
		return new ResponseEntity<Product>(pr, HttpStatus.CREATED);

	}

	@GetMapping("/getproduct/{id}")
	public ResponseEntity<Product> getProductDetails(@PathVariable Integer id) {
		logger.info("In the product controller,save method");
		Product pro = productService.getProductDetails(id);
		return new ResponseEntity<Product>(pro, HttpStatus.ACCEPTED);

	}
}
