package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

	@PostMapping("/saveuserdetails")
	public UserDetails saveUserDetails(@RequestBody UserDetails userDetails) {

		return userDetailsService.saveUserDetails(userDetails);

	}

}
