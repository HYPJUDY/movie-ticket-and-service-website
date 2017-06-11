package com.team.legendary.web.controllers;

import com.team.legendary.persistence.service.MovieService;

import java.awt.print.Printable;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.team.legendary.persistence.entity.Movie;
import com.team.legendary.persistence.entity.Order;

import org.springframework.ui.Model;
/**
 * Created by linxp on 2017-6-7.
 */

@Controller
@RequestMapping("/ticket")
public class TicketController {
	
	@ModelAttribute("order")
	public Order getOrder() {
		return new Order();
	}

    @Autowired
    private MovieService movieService;
	
    @GetMapping
    public String getTicket(@RequestParam("mname") String movieName, Model model) {
        Subject subject = SecurityUtils.getSubject();
        Boolean vipFlag = false;
        System.out.print(movieName);
        //VIP通道
        if (subject.hasRole("CustomerVIP") && subject.isPermitted("Dischange")) {
            vipFlag = true;
        }
        model.addAttribute("vipFlag", vipFlag);

        Movie movie = movieService.findByName(movieName);
        Double price = movie.getPrice();
        String time = movie.getTime();
        model.addAttribute("mname", movieName);
        model.addAttribute("price", price);
        model.addAttribute("time", time);
        return "ticket";
    }
}
