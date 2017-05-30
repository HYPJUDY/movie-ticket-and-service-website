package com.team.legendary.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.team.legendary.persistence.entity.Customer;
import com.team.legendary.persistence.service.CustomerService;


@Controller
public class SignupController {

	@Autowired
	private CustomerService customerService;
	
	@ModelAttribute("customer")
	public Customer getCustomer() {
		return new Customer();
	}
	
	@GetMapping("/signup")
    public String finishSignup(final Customer customer) {
		System.out.println("signup...");
        return "signup";
    }
	
	@PostMapping("/signup")
	public String signupSubmit(@ModelAttribute("customer")Customer customer) {
		try {
			customerService.create(customer);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "login";
	}
			
}
