package com.team.restaurant_second.web.controller;

import com.team.restaurant_second.persistence.entity.Dish;
import com.team.restaurant_second.persistence.service.DishService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team.restaurant_second.persistence.entity.Order;
import com.team.restaurant_second.persistence.service.OrderService;

import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.http.HttpSession;

/**
 * Created by young on 16-11-2.
 */

@Controller
@RequestMapping("/menu")
public class MenuController {
		
	@Autowired
	private OrderService orderService;
    @Autowired
    private DishService dishService;
	
	@ModelAttribute("dish") 
	public Order getDish(Integer id) {
		return orderService.findById(id);
	}
	
    @GetMapping
    public String getMenu(Model model, HttpSession session)
    {
        model.addAttribute("title", "菜单");

        Subject subject = SecurityUtils.getSubject();
        boolean isAuthc = false;
        if (subject.isAuthenticated()) {
            isAuthc = true;
        }
        model.addAttribute("isAuthc", isAuthc);

        List<Dish> dishes = dishService.findAll();
        model.addAttribute("dishes", dishes);

        return "menu";
    }
}
