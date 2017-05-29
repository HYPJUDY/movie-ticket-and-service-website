package com.team.legendary.web.controllers;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.hibernate.sql.ordering.antlr.GeneratedOrderByFragmentParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team.legendary.persistence.entity.Order;
import com.team.legendary.persistence.service.OrderService;


@Controller

public class TicketController {
	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/ticket", method = RequestMethod.POST)
    public String finishOrderTicket(final ModelMap model, @ModelAttribute("ticket") Order order, final BindingResult bindingResult ) {
    	model.clear();
		if (bindingResult.hasErrors()) {
    		return "redirect:/ticket";
    	}
		
		Subject subject = SecurityUtils.getSubject();
		order.setCustomerName(subject.getPrincipal().toString());
		String seating = order.getMovieSeating();
		//order.setExpenditure(expenditure);
		System.out.println(order.getMovieName() + order.getMovieSeating());
        return "ticket";
    }
	
	@RequestMapping("ticket/{orderId}")
	public String orderDetail(@PathVariable("orderId")String orderId) {
		return	"ticket";
	}
}
