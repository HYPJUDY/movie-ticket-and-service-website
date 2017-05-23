package com.team.restaurant_second.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team.restaurant_second.persistence.entity.Customer;


@Controller
public class RegisterController {
	
	@ModelAttribute("customer")
	public Customer getCustomer() {
		return new Customer();
	}
	
	@RequestMapping(value = "/register")
    public String finishRegister(final Customer customer) {
		System.out.println("111");
        return "register";
    }
}
