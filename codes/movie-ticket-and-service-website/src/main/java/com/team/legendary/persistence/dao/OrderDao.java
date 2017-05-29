package com.team.legendary.persistence.dao;

import java.util.List;

import com.team.legendary.persistence.entity.Order;


public interface OrderDao {
	List<Order> findAll();
	
	Order findOne(final Integer id);
	
	void create(Order entity);
}
