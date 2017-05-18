package com.team.restaurant_second.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.team.restaurant_second.persistence.entity.Dish;



@Repository
public class DishDaoImpl implements DishDao {

	private JdbcTemplate jdbcTemplate;


	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public static final class DishMapper implements RowMapper<Dish> {

		public Dish mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Dish dish = new Dish();
			dish.setId(rs.getInt("id"));
			dish.setName(rs.getString("name"));
			dish.setPrice(rs.getDouble("price"));
			dish.setDescription(rs.getString("description"));
			dish.setPic(rs.getString("pic"));
			return dish;
		}

	}

	public List<Dish> findAll() {
		List<Dish> dishs = this.jdbcTemplate.query("select * from Dish", new DishMapper());
		return dishs;
	}

	public Dish findOne(String name) {
		List<Dish> dishs = this.jdbcTemplate.query("select * from Dish where name = '" + name + "'", new DishMapper());
		if (dishs.isEmpty()) return null;
		return dishs.get(0);
	}
	
	public Dish findOne(Integer id) {
		List<Dish> dishs = this.jdbcTemplate.query("select * from Dish where id = " + id, new DishMapper());
		if (dishs.isEmpty()) return null;
		return dishs.get(0);
	}

	public void create(Dish entity) {
		final String INSERT_SQL = "insert into Dish (name, price, description, pic) values(?,?,?,?)";
		final Dish temp = entity;

		System.out.println("-------------------------Insert counter!");
		KeyHolder keyHolder = new GeneratedKeyHolder();
		this.jdbcTemplate.update(
				new PreparedStatementCreator() {
					public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
						PreparedStatement ps = connection.prepareStatement(INSERT_SQL, new String[] {"id"});
						ps.setString(1, temp.getName());
						ps.setDouble(2, temp.getPrice());
						ps.setString(3, temp.getDescription());
						ps.setString(4, temp.getPic());
						return ps;
					}
				},
				keyHolder);
	}

}
