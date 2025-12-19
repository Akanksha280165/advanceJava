package com.kodewala.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(OrderIdNotFoundException.class)
	public String handleOrderIdNotFoundException(OrderIdNotFoundException  ex)
	{
		return ex.getMessage(); 
	}
	
	@ExceptionHandler(OrderNotDeletedException.class)
	public String handleOrderNotDeleteException(OrderNotDeletedException ex)
	{
		return ex.getMessage();
	}
	
	@ExceptionHandler(OrderUnsavedException.class)
	public String handleOrderUnsavedException(OrderUnsavedException ex)
	{
		return ex.getMessage();
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String handleNullObject(NullPointerException ex)
	{
		return ex.getMessage();
	}
	
	@ExceptionHandler(Exception.class)
	public String handleException(Exception ex)
	{
		return ex.getMessage();
		
	}

	
}
