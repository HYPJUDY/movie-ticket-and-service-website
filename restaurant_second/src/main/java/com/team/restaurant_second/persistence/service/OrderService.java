package com.team.restaurant_second.persistence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.restaurant_second.persistence.dao.OrderDao;
import com.team.restaurant_second.persistence.entity.Order;



@Service
public class OrderService {
	@Autowired
	private OrderDao dao;
	
	public OrderService() {
        super();
    }
    
    public void create(final Order entity) {
    	dao.create(entity);
    }
    
    public List<Order> findAll() {
        return dao.findAll();
    }

    public Order findById(final Integer id) {
        return dao.findOne(id);
    }
}
