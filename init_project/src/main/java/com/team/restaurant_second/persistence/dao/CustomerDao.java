package com.team.restaurant_second.persistence.dao;

import java.util.List;

import com.team.restaurant_second.persistence.entity.Customer;


public interface CustomerDao {
	List<Customer> findAll();
	
	Customer findOne(String name);
	
	void create(Customer entity);
}
