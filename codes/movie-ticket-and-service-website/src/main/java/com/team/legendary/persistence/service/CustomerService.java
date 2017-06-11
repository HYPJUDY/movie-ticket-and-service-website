package com.team.legendary.persistence.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team.legendary.persistence.dao.CustomerDao;
import com.team.legendary.persistence.entity.Customer;

@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerDao dao;
    
    public CustomerService() {
        super();
    }
    public void create(final Customer entity) {
        dao.create(entity);
    }
    
    public List<Customer> findAll() {
        return dao.findAll();
    }

   
    public Customer findByName(final String name) {
        return dao.findOne(name);
    }
    
}
