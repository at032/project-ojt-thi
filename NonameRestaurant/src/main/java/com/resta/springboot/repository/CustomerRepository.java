package com.resta.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resta.springboot.model.Customer;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Integer>{
	Customer findByCustomerID(int id);
	
	Customer findByLoginId(long loginId);
	
	List<Customer> findByClassCus(String classCus);
	
} 