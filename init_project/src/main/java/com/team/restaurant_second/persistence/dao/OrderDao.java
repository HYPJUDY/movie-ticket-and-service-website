package com.team.restaurant_second.persistence.dao;

import java.util.List;

import com.team.restaurant_second.persistence.entity.Order;


public interface OrderDao {
	List<Order> findAll();
	
	Order findOne(final Integer id);
	
	void create(Order entity);
}
