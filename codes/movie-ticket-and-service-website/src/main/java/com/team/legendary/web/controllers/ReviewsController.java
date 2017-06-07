package com.team.legendary.web.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team.legendary.persistence.entity.Movie;
import com.team.legendary.persistence.entity.Order;
import com.team.legendary.persistence.service.MovieService;
import com.team.legendary.persistence.service.OrderService;

/**
 * Created by linxp on 2017/6/7.
 */
@Controller
@RequestMapping(value = "/reviews")
public class ReviewsController {

   
    @Autowired
	private OrderService orderService;
    @Autowired
    private MovieService movieService;
	
	@ModelAttribute("movie") 
	public Order getMovie(Integer id) {
		return orderService.findById(id);
	}
	
    @GetMapping
    public String getMenu(Model model, HttpSession session)
    {
        //model.addAttribute("title", "Movie List");
        Subject subject = SecurityUtils.getSubject();
        boolean isAuthc = false;
        if (subject.isAuthenticated()) {
            isAuthc = true;
        }
        model.addAttribute("isAuthc", isAuthc);

        List<Movie> movies = movieService.findAll();
        model.addAttribute("movies", movies);

        return "reviews";
    }
}
