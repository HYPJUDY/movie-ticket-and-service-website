package com.team.legendary.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.sql.DataSource;

import org.omg.IOP.TAG_MULTIPLE_COMPONENTS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.team.legendary.persistence.entity.Movie;;



@Repository
public class MovieDaoImpl implements MovieDao {

	private JdbcTemplate jdbcTemplate;


	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public static final class DishMapper implements RowMapper<Movie> {

		public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Movie movie = new Movie();
			movie.setId(rs.getInt("id"));
			movie.setName(rs.getString("movieName"));
			movie.setPrice(rs.getDouble("price"));
			movie.setDescrition(rs.getString("description"));
			movie.setPoster(rs.getString("moviePoster"));
			movie.setAvgRating(rs.getDouble("movieAvgRating"));
			movie.setCast(rs.getString("movieCast"));
			movie.setDirection(rs.getString("movieDirection"));
			movie.setGenre(rs.getString("movieGenre"));
			movie.setDuration(rs.getInt("movieDuration"));
			return movie;
		}

	}

	public List<Movie> findAll() {
		List<Movie> dishs = this.jdbcTemplate.query("select * from Movie", new DishMapper());
		return dishs;
	}

	public Movie findOne(String name) {
		List<Movie> movies = this.jdbcTemplate.query("select * from Movie where name = '" + name + "'", new DishMapper());
		if (movies.isEmpty()) return null;
		return movies.get(0);
	}

	public void create(Movie entity) {
		final String INSERT_SQL = "insert into Movie (movieName, price, description, moviePoster, movieAvgRating, movieCast, movieDirection, movieGenre, movieDuration) values(?,?,?,?,?,?,?,?,?)";
		final Movie temp = entity;

		System.out.println("-------------------------Insert counter!");
		KeyHolder keyHolder = new GeneratedKeyHolder();
		this.jdbcTemplate.update(
				new PreparedStatementCreator() {
					public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
						PreparedStatement ps = connection.prepareStatement(INSERT_SQL, new String[] {"id"});
						ps.setString(1, temp.getName());
						ps.setDouble(2, temp.getPrice());
						ps.setString(3, temp.getDescrition());
						ps.setString(4, temp.getPoster());
						ps.setDouble(5, temp.getAvgRating());
						ps.setString(6, temp.getCast());
						ps.setString(7, temp.getDirection());
						ps.setString(8, temp.getGenre());
						ps.setInt(9, temp.getDuration());
						return ps;
					}
				},
				keyHolder);
	}

}
