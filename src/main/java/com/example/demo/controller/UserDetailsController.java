package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserDetails;
import com.example.demo.service.UserDetailsService;

@RestController
@RequestMapping("/UserDetails")
public class UserDetailsController {

	@Autowired
	private UserDetailsService userDetailsService;

	private static final Logger logger = LoggerFactory.getLogger(UserDetailsController.class);

	@PostMapping("/saveuserdetails")
	public ResponseEntity<UserDetails> saveUserDetails(@RequestBody UserDetails userDetails) {
		logger.info("In the UserDetailsController class");
		UserDetails savedUserDetails = userDetailsService.saveUserDetails(userDetails);
		return new ResponseEntity<UserDetails>(savedUserDetails, HttpStatus.CREATED);
	}
}
