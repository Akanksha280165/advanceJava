package com.kodewala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.request.ApiRequest1;
import com.kodewala.request.ApiRequest2;
import com.kodewala.service.ApiService;

@RestController
public class ApiController {

	@Autowired
	ApiService service;
	
	@PostMapping("createInfo")
	public String createEmpInfo(@RequestBody  ApiRequest1 req1)
	{
		String s1=null;
		int n1=service.createEmpDetails(req1);
		if(n1==1)
		{
			s1="request1 data is saved";
		}
		return s1;
	}
	
	@PostMapping("updateInfo")
	public String updateEmpInfo(@RequestBody ApiRequest2 req2)
	{
		String s1=null;
		int n1=service.updateEmpDetails(req2);
		if(n1==1)
		{
			s1="request2 data is updated wrt employeeId given";
		}
		return s1;
	}
	
	@PostMapping("removeInfo")
	public String deleteEmpInfo(@RequestBody  ApiRequest2 req2)
	{
		String s1=null;
		int n1=service.deleteEmpDetails(req2);
		if(n1==1)
		{
			s1="request2 data is removed wrt employeeId given";
		}
		return s1;
	}
	
}
