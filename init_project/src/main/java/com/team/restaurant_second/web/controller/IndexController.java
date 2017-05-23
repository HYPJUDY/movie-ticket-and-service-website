package com.team.restaurant_second.web.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.team.restaurant_second.application.SpringServletInitializer;
import com.team.restaurant_second.persistence.entity.Customer;
import com.team.restaurant_second.persistence.entity.Dish;
import com.team.restaurant_second.persistence.entity.Order;
import com.team.restaurant_second.persistence.service.CustomerService;
import com.team.restaurant_second.persistence.service.DishService;
import com.team.restaurant_second.persistence.service.OrderService;



/**
 * Created by young on 16-11-2.
 */
@Controller
public class IndexController {
	
	@RequestMapping(value = "/index")
    public String IndexPage(ModelMap model, HttpSession session) {
        model.addAttribute("title", "吃啥咧");
       
        return "index";
    }
    
    @RequestMapping(value = "/index",  method = RequestMethod.POST) 
    public String IndexPage(@ModelAttribute("customer")Customer _customer, ModelMap model) {
    	System.out.println("index");
    	String _name = _customer.getName();
    	String _pass = _customer.getPassword();
    	
    	System.out.println(_name);
    	System.out.println(_pass);
    	UsernamePasswordToken token = new UsernamePasswordToken(_name, _pass);
    	token.setRememberMe(true);
    	Subject subject = SecurityUtils.getSubject();
    	try {
			subject.login(token);
			if (subject.isAuthenticated()) {
				System.out.println("OK");
				if (subject.hasRole("CustomerVIP") && subject.isPermitted("Dischange")) {
					System.out.println("VIP");
				}
				return "index";
			}
			else {
				System.out.println("No");
				return "login";
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			e.printStackTrace();
		}
    	
    	return "login";
    }
}
