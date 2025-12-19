package com.kodewala.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.entity.InvoiceEntity;
import com.kodewala.request.ApiRequest;
import com.kodewala.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ApiController {
	@Autowired
	ApiService service;
	
	@PostMapping("/createInfo")
	public String createBillInvoice(@RequestBody  ApiRequest req1)
	{
		String n1=service.createInvoice(req1);
		return n1;
	}
	
	@GetMapping("/getinvoice/{status}")
	public String getInvoiceByStatus(@PathVariable String status)
	{
		 List<InvoiceEntity> list=service.getInvoiceByPaymentStatus(status);
		return "your invoice is : "+list.get(1).getInvoice();
		
	}
	
}
