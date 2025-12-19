package com.kodewala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodewala.entity.ApiEntity;

@Repository
public interface ApiRepository extends JpaRepository<ApiEntity, Integer>{

}
