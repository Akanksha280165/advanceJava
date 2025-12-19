package com.kodewala.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.kodewala.entity.InvoiceEntity;
import com.kodewala.repository.ApiRepository;
import com.kodewala.request.ApiRequest;

@Service
public class ApiService {
	@Autowired
	ApiRepository repository;
	
	public String createInvoice( ApiRequest req1)
	{
		InvoiceEntity entity=new  InvoiceEntity();
		entity.setProductPrice(req1.getProductPrice());
		entity.setProductPaymentStatus(req1.getProductPaymentStatus());
		entity.setCutomerBill(req1.getCutomerBill());
		entity.setCustomerSst(req1.getCustomerSst());
		entity.setCustomerGst(req1.getCustomerGst());
		entity=repository.save(entity);
		if(entity.getCustomerCount()!=null)
		{
			return "your invoice created successfully";
		}
		else
		{
			return "invoice not created try again";
		}
	}
	
	public List<InvoiceEntity> getInvoiceByPaymentStatus(String s1)
	{
		List<InvoiceEntity> invoice =repository.findByProductPaymentStatus(s1);
		return invoice;
	}

}
