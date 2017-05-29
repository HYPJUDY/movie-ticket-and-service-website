package com.team.legendary.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team.legendary.persistence.entity.Customer;
import com.team.legendary.persistence.service.CustomerService;

@Controller
public class LoginController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST) 
	public String login(@ModelAttribute("customer")Customer customer) {
		try {
			customerService.create(customer);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "login";
	}
		
	@RequestMapping(value = "/login")
    public String startLogin(@ModelAttribute("customer")Customer customer) {
		return "login";
    }
}
