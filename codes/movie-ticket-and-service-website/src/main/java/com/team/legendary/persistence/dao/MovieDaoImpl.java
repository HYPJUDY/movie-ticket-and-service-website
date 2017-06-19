package com.team.legendary.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.sql.DataSource;

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

	public static final class MovieMapper implements RowMapper<Movie> {

		public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Movie movie = new Movie();
			movie.setId(rs.getInt("id"));
			movie.setMname(rs.getString("mname"));
			movie.setPrice(rs.getDouble("price"));
			movie.setDescription(rs.getString("description"));
			movie.setPoster(rs.getString("poster"));
			movie.setRating(rs.getDouble("rating"));
			movie.setCast(rs.getString("cast"));
			movie.setDirection(rs.getString("direction"));
			movie.setGenre(rs.getString("genre"));
			movie.setDuration(rs.getInt("duration"));
			movie.setTime(rs.getString("time"));
			movie.setTrailer(rs.getString("trailer"));
			return movie;
		}

	}

	public List<Movie> findAll() {
		List<Movie> movies = this.jdbcTemplate.query("select * from Movie", new MovieMapper());
		Collections.sort(movies, new Comparator<Movie>(){
            public int compare(Movie arg0, Movie arg1) {
                return arg1.getRating().compareTo(arg0.getRating());
            }
        });
		return movies;
	}

	public Movie findOne(String name) {
		List<Movie> movies = this.jdbcTemplate.query("select * from Movie where mname = '" + name + "'", new MovieMapper());
		if (movies.isEmpty()) return null;
		return movies.get(0);
	}

	public void create(Movie entity) {
		final String INSERT_SQL = "insert into Movie (mname, price, description, poster, rating, cast, direction, genre, duration, time, trailer) values(?,?,?,?,?,?,?,?,?,?,?)";
		final Movie temp = entity;

		System.out.println("-------------------------Insert counter!");
		KeyHolder keyHolder = new GeneratedKeyHolder();
		this.jdbcTemplate.update(
				new PreparedStatementCreator() {
					public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
						PreparedStatement ps = connection.prepareStatement(INSERT_SQL, new String[] {"id"});
						ps.setString(1, temp.getMname());
						ps.setDouble(2, temp.getPrice());
						ps.setString(3, temp.getDescription());
						ps.setString(4, temp.getPoster());
						ps.setDouble(5, temp.getRating());
						ps.setString(6, temp.getCast());
						ps.setString(7, temp.getDirection());
						ps.setString(8, temp.getGenre());
						ps.setInt(9, temp.getDuration());
						ps.setString(10, temp.getTime());
						ps.setString(11, temp.getTrailer());
						return ps;
					}
				},
				keyHolder);
	}

}
