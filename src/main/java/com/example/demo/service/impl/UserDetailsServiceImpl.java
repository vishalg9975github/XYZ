package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserDetails;
import com.example.demo.repository.UserDetailsRepository;
import com.example.demo.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsrepository;

	@Override
	public UserDetails saveUserDetails(UserDetails userDetails) {

		return userDetailsrepository.save(userDetails);
	}

}
