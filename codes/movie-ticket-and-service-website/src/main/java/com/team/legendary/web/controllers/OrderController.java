package com.team.legendary.web.controllers;

import com.team.legendary.persistence.entity.Movie;
import com.team.legendary.persistence.service.MovieService;
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

public class OrderController {
	@Autowired
	private MovieService movieService;
	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/ticket_success", method = RequestMethod.POST)
    public String finishOrderTicket(final ModelMap model, @ModelAttribute("order") Order order, final BindingResult bindingResult ) {
    	model.clear();
		if (bindingResult.hasErrors()) {
    		return "redirect:/ticket";
    	}

        System.out.println(order.getMname());


		Movie movie = movieService.findByName(order.getMname());
		//Subject subject = SecurityUtils.getSubject();
		if (SecurityUtils.getSubject() == null) return "index";
		order.setCname(SecurityUtils.getSubject().getPrincipal().toString());
		order.setExpenditure(order.getCount() * movie.getPrice());
        System.out.println(SecurityUtils.getSubject().getPrincipal().toString());

        orderService.create(order);

        model.addAttribute("order", order);

        return "ticket_success";
    }

	@RequestMapping("order/{orderId}")
	public String orderDetail(@PathVariable("orderId")String orderId) {
		return	"order";
	}
}
