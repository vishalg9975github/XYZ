package com.example.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserDetails;
import com.example.demo.repository.UserDetailsRepository;
import com.example.demo.service.UserDetailsService;

import jakarta.transaction.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsrepository;

	private static final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

	@Override
	@Transactional
	public UserDetails saveUserDetails(UserDetails userDetails) {

		logger.info("In userDetailsServiceImpl class");
		return userDetailsrepository.save(userDetails);
	}

}
