package com.team.legendary.persistence.dao;

import java.util.List;

import com.team.legendary.persistence.entity.Customer;


public interface CustomerDao {
	List<Customer> findAll();
	
	Customer findOne(String name);
	
	void create(Customer entity);
}
