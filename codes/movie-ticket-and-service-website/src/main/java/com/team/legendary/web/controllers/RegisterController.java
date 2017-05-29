package com.team.legendary.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team.legendary.persistence.entity.Customer;


@Controller
public class RegisterController {
	
	@ModelAttribute("customer")
	public Customer getCustomer() {
		return new Customer();
	}
	
	@RequestMapping(value = "/signup")
    public String finishRegister(final Customer customer) {
		System.out.println("register...");
        return "signup";
    }
}
