package com.example.demo.service;

import com.example.demo.model.UserDetails;

public interface UserDetailsService {

	public UserDetails saveUserDetails(UserDetails userDetails);

	/* service for fetching userDetails by id */
	public UserDetails getUserDetails(Integer id);

}
