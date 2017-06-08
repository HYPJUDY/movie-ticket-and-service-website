package com.team.legendary.web.controllers;

import com.team.legendary.persistence.entity.Movie;
import com.team.legendary.persistence.entity.Order;
import com.team.legendary.persistence.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by erwin on 17-6-8.
 */

@Controller
@RequestMapping("/single/{mname}")
public class SingleController {
    @ModelAttribute("order")
    public Order getOrder() {
        return new Order();
    }

    @Autowired
    private MovieService movieService;

    @GetMapping
    public String getDetail(@PathVariable("mname") String name, Model model) {
        Movie movie = movieService.findByName(name);
        model.addAttribute("movie", movie);

        return "single";
    }
}
