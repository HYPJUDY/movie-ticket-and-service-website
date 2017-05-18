package com.team.restaurant_second.persistence.dao;

import java.util.List;

import com.team.restaurant_second.persistence.entity.Dish;


public interface DishDao {
	List<Dish> findAll();
	
	Dish findOne(final String name);
	
	Dish findOne(final Integer id);
	
	void create(Dish entity);
}
