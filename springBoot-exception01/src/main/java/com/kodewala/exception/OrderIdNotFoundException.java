package com.kodewala.exception;

public class OrderIdNotFoundException extends RuntimeException{

	public OrderIdNotFoundException(String s) {
		super(s);
	}
}
