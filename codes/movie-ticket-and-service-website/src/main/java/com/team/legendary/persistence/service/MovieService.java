package com.team.legendary.persistence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.legendary.persistence.dao.MovieDao;
import com.team.legendary.persistence.entity.Movie;;


@Service
public class MovieService {
	
	@Autowired
	private MovieDao dao;
	
	public MovieService() {
		super();
	}
	
	public void create (final Movie entity) {
		dao.create(entity);
	}
	
	public List<Movie> findAll() {
        return dao.findAll();
    }

    public Movie findByName(final String name) {
        return dao.findOne(name);
    }
	
}
