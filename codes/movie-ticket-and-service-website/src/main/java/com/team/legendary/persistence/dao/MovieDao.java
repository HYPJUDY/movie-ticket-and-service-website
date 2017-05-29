package com.team.legendary.persistence.dao;

import java.util.List;

import com.team.legendary.persistence.entity.Movie;;


public interface MovieDao {
	List<Movie> findAll();
	
	Movie findOne(final String name);
	
	void create(Movie entity);
}
