package com.kodewala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodewala.entity.ApiEntity1;


@Repository
public interface InvoiceRepository extends JpaRepository<ApiEntity1, Integer> {
	
	

}
