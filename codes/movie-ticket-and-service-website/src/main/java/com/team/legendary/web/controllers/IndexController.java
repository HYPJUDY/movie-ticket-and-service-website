package com.team.legendary.web.controllers;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team.legendary.persistence.entity.Customer;
import com.team.legendary.persistence.service.CustomerService;
import com.team.legendary.persistence.service.MovieService;

@Controller
public class IndexController {

    @RequestMapping("/ticket")
    String ticket() {
        return  "ticket";
    }
    
    @RequestMapping("/reviews")
    String review() {
        return  "reviews";
    }
    
    @RequestMapping("/single")
    String single() {
        return  "single";
    }
    
    @RequestMapping("/ticket_success")
    String ticket_success() {
        return  "ticket_success";
    }

//    @RequestMapping("/login")
//    String login() {
//        return  "login";
//    }

//    @RequestMapping("/signup")
//    String signup() {
//        return  "signup";
//    }
    @Autowired
	private MovieService  movieService;
	@Autowired
	private CustomerService customerService;
	
	@ModelAttribute()
	@RequestMapping(value = "/index")
    public String IndexPage(ModelMap model, HttpSession session) {
        Object object = session.getAttribute("user");
//        if (object != null) {
//        	session.invalidate();
//        	model.addAttribute("url", "/loginout");
//            model.addAttribute("status", "登出");
//            System.out.println("loginout");
//        }
//        else {
//        	model.addAttribute("url", "/login");
//            model.addAttribute("status", "登录");
//            System.out.println("login");
//		}
        
        return "index";
    }
    
    @RequestMapping(value = "/index",  method = RequestMethod.POST) 
    public String IndexPage(@ModelAttribute("customer")Customer _customer, ModelMap model) {
    	System.out.println("index");
    	String _name = _customer.getCustomerName();
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
				/*model.clear();
				model.addAttribute("name", _name);*/
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
