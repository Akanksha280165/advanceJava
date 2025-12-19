package com.kodewala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.request.ApiRequestBean1;
import com.kodewala.service.ApiServiceLayer;

@RestController
public class ApiControllerLayer {
	
	@Autowired
	ApiServiceLayer service;
	private String s1;
	
	@PostMapping("createInvoice")
	public String  createInfo(@RequestBody  ApiRequestBean1  bean1)
	{
		int response=service.createInvoiceDetails(bean1);
		if(response!=0)
		{
		String s1= "your invoice created successfully";
		}
		return s1;
	}

}
