package com.kodewala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.entity.ApiEntity1;
import com.kodewala.repository.InvoiceRepository;
import com.kodewala.request.ApiRequestBean1;

@Service
public class ApiServiceLayer {
	
	@Autowired
	InvoiceRepository invoiceRepo;
	
	public Integer  createInvoiceDetails(ApiRequestBean1  bean1)
	{
		ApiEntity1 entity1=new  ApiEntity1();
		entity1.setInvoiceGSTNumber(bean1.getInvoiceGSTNumber());
		entity1.setInvoiceValue(bean1.getInvoiceValue());
		entity1.setInvoiceNote(bean1.getInvoiceNote());
		entity1.setInvoiceStatus(bean1.getInvoiceStatus());
		entity1.setInvoiceDescription(bean1.getInvoiceDescription());
		entity1 =invoiceRepo.save(entity1);
		return entity1.getInvoiceCount();
		
	}

}
