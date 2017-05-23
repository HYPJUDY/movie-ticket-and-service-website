package com.team.restaurant_second.web.controller;

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

import com.team.restaurant_second.persistence.entity.Dish;
import com.team.restaurant_second.persistence.entity.Order;
import com.team.restaurant_second.persistence.service.DishService;
import com.team.restaurant_second.persistence.service.OrderService;


/**
 * Created by young on 16-11-2.
 */
@Controller

public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private DishService dishService;

	@RequestMapping(value = "/order", method = RequestMethod.POST)
    public String finishOrder(final ModelMap model, @ModelAttribute("order") Order order, final BindingResult bindingResult ) {
    	model.clear();
		if (bindingResult.hasErrors()) {
    		return "redirect:/index";
    	}
		
		Subject subject = SecurityUtils.getSubject();
		int count = order.getDishCount();
		Dish dish = dishService.findByName(order.getDishName());
		
		order.setCustomerName(subject.getPrincipal().toString());
		order.setDishName(order.getDishName());
		order.setExpenditure(count * dish.getPrice());
		
		orderService.create(order);
		
		System.out.println(order.getDishName()+order.getDishCount());
        return "order";
    }
	
	@RequestMapping("order/{orderId}")
	public String orderDetail(@PathVariable("orderId")String orderId) {
		
		return	"order";
	}
}
