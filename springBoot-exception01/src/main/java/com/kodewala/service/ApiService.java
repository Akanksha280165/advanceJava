package com.kodewala.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kodewala.SpringBootException01Application;
import com.kodewala.entity.ApiEntity;
import com.kodewala.exception.OrderIdNotFoundException;
import com.kodewala.exception.OrderNotDeletedException;
import com.kodewala.exception.OrderUnsavedException;
import com.kodewala.repository.ApiRepository;
import com.kodewala.request.ApiRequest1;
import com.kodewala.request.ApiRequest2;

@Service
public class ApiService {

    private final SpringBootException01Application springBootException01Application;
	@Autowired
	ApiRepository repository;

    ApiService(SpringBootException01Application springBootException01Application) {
        this.springBootException01Application = springBootException01Application;
    }
	
	public Integer createEmpDetails(ApiRequest1 req1)
	{
		ApiEntity entity=new  ApiEntity();
		entity.setEmpName(req1.getEmpName());
		entity.setEmpContact(req1.getEmpContact());
		entity.setEmpMail(req1.getEmpMail());
		entity.setEmpDep(req1.getEmpDep());
		entity.setEmpRole(req1.getEmpRole());
		entity.setEmpSalary(req1.getEmpSalary());
		entity=repository.save(entity);
		if(entity.getEmpWorkforceId()==null)
		{
			throw new OrderUnsavedException("data is not saved");
		}
		else
		{
			return 1;
		}
	}
	
	public Integer updateEmpDetails(ApiRequest2 req2)
	{
		Optional<ApiEntity> optional=repository.findById(req2.getEmpID());
		if(optional.isEmpty())
		{
			throw new OrderIdNotFoundException("enter valid employee Id");
		}
		else
		{
			ApiEntity entity=optional.get();
			entity.setEmpContact(req2.getEmpNewContact());
			entity.setEmpDep(req2.getEmpNewDep());
			entity.setEmpRole(req2.getEmpNewRole());
			entity.setEmpSalary(req2.getEmpNewSalary());
			repository.save(entity);
			return 1;
		}
	}
	
	public Integer deleteEmpDetails(ApiRequest2 req2)
	{
		Optional<ApiEntity> optional=repository.findById(req2.getEmpID());
		if(optional.isEmpty())
		{
			throw new OrderIdNotFoundException("employee Id given Is invalid");
		}
		else
		{
			repository.deleteById(req2.getEmpID());
			if(repository.findById(req2.getEmpID())==null)
			{
				throw new OrderNotDeletedException("employee data is not removed for given Id");
			}
			return 1;
		}
	}

}
