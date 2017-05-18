package com.team.restaurant_second.persistence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.restaurant_second.persistence.dao.DishDao;
import com.team.restaurant_second.persistence.entity.Dish;


@Service
public class DishService {
	
	@Autowired
	private DishDao dao;
	
	public DishService() {
		super();
	}
	
	public void create (final Dish entity) {
		dao.create(entity);
	}
	
	public List<Dish> findAll() {
        return dao.findAll();
    }

    public Dish findByName(final String name) {
        return dao.findOne(name);
    }
    
    public Dish findById(final Integer id) {
    	return dao.findOne(id);
    }
	
}
