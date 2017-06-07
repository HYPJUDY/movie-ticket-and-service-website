package com.team.legendary.web.controllers;

import com.team.legendary.persistence.service.MovieService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.team.legendary.persistence.entity.Movie;
import com.team.legendary.persistence.entity.Order;

import org.springframework.ui.Model;
/**
 * Created by linxp on 2017-6-7.
 */

@Controller
@RequestMapping("/ticket/{movieName}")
public class TicketController {
	
	@ModelAttribute("order")
	public Order getOrder() {
		return new Order();
	}

    @Autowired
    private MovieService movieService;
	
    @GetMapping
    public String getTicket(@PathVariable("movieName") String movieName, Model model) {

        Subject subject = SecurityUtils.getSubject();
        Boolean vipFlag = false;
        //VIP通道
        if (subject.hasRole("CustomerVIP") && subject.isPermitted("Dischange")) {
            vipFlag = true;
        }
        model.addAttribute("vipFlag", vipFlag);
        model.addAttribute("movieName", movieName);
        return "ticket";
    }
}
