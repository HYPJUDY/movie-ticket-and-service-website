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
			movie.setName(rs.getString("movie_name"));
			movie.setPrice(rs.getDouble("price"));
			movie.setDescription(rs.getString("description"));
			movie.setPoster(rs.getString("poster"));
			movie.setRating(rs.getDouble("rating"));
			movie.setCast(rs.getString("cast"));
			movie.setDirection(rs.getString("direction"));
			movie.setGenre(rs.getString("genre"));
			movie.setDuration(rs.getInt("duration"));
			return movie;
		}

	}

	public List<Movie> findAll() {
		List<Movie> dishs = this.jdbcTemplate.query("select * from Movie", new DishMapper());
		return dishs;
	}

	public Movie findOne(String name) {
		List<Movie> movies = this.jdbcTemplate.query("select * from Movie where movie_name = '" + name + "'", new DishMapper());
		if (movies.isEmpty()) return null;
		return movies.get(0);
	}

	public void create(Movie entity) {
		final String INSERT_SQL = "insert into Movie (movie_name, price, description, poster, rating, cast, direction, genre, duration) values(?,?,?,?,?,?,?,?,?)";
		final Movie temp = entity;

		System.out.println("-------------------------Insert counter!");
		KeyHolder keyHolder = new GeneratedKeyHolder();
		this.jdbcTemplate.update(
				new PreparedStatementCreator() {
					public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
						PreparedStatement ps = connection.prepareStatement(INSERT_SQL, new String[] {"id"});
						ps.setString(1, temp.getName());
						ps.setDouble(2, temp.getPrice());
						ps.setString(3, temp.getDescription());
						ps.setString(4, temp.getPoster());
						ps.setDouble(5, temp.getRating());
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
