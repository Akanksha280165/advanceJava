package com.kodewala.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kodewala.entity.InvoiceEntity;

@Repository
public interface ApiRepository extends CrudRepository<InvoiceEntity, Integer>{
	
	//crud gives 4basic functionality create ,update,delete
	//method derivation gives customised method to execute query 
	//repository.save() is predefined nd available
	//let us defined a method to execute query
  List<InvoiceEntity>	findByproductPaymentStatus(String productPaymentStatus);

List<InvoiceEntity> findByProductPaymentStatus(String s1);
}
