package com.team.restaurant_second.web.controller;

import com.team.restaurant_second.persistence.service.DishService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.team.restaurant_second.persistence.entity.Dish;
import com.team.restaurant_second.persistence.entity.Order;

import org.springframework.ui.Model;
/**
 * Created by young on 16-11-2.
 */

@Controller
@RequestMapping("/cuisine_detail/{name}")
public class DetailController {
	
	@ModelAttribute("order")
	public Order getOrder() {
		return new Order();
	}

    @Autowired
    private DishService dishService;
    
    @ModelAttribute("dish") 
    public Dish getDish(@PathVariable("name") String name) {
    	return dishService.findByName(name);
    }
	
    @GetMapping
    public String getDetail(@PathVariable("name") String name, Model model) {
    	//dish = dishService.findById(1);
        Subject subject = SecurityUtils.getSubject();
        Boolean vipFlag = false;
        //VIP通道
        if (subject.hasRole("CustomerVIP") && subject.isPermitted("Dischange")) {
            vipFlag = true;
            model.addAttribute("dischangePrice", dishService.findByName(name).getPrice()*0.95);
        }
        model.addAttribute("vipFlag", vipFlag);

        model.addAttribute("title", "点单详情");
        model.addAttribute("name", name);
        return "cuisine_detail";
    }
}
