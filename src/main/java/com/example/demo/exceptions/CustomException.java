package com.example.demo.exceptions;

public class CustomException extends RuntimeException {

	private String message;

	public CustomException(String message) {
		super(message);
	}

}
