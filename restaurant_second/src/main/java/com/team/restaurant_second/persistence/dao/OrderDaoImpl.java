package com.team.restaurant_second.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.team.restaurant_second.persistence.entity.Order;



@Repository
public class OrderDaoImpl implements OrderDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
	    this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private OrderDaoImpl() {
		super();
	}
	
	public static final class OrderMapper implements RowMapper<Order> {

		public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Order order = new Order();
			order.setId(rs.getInt("id"));
			order.setCustomerName(rs.getString("customerName"));
			order.setExpenditure(rs.getDouble("expenditure"));
			order.setDishName(rs.getString("dishName"));
			order.setDishCount(rs.getInt("dishCount"));
			return order;
		}
    	
    }
	
	public List<Order> findAll() {
		List<Order> orders = this.jdbcTemplate.query("select * from OrderTable", new OrderMapper());
    	return orders;
	}

	public Order findOne(Integer id) {
		List<Order> orders = this.jdbcTemplate.query("select * from OrderTable", new OrderMapper());
    	if (orders.isEmpty()) return null;
    	return orders.get(0);
	}

	public void create(Order entity) {
		final String INSERT_SQL = "insert into OrderTable (customerName, expenditure, dishName, dishCount) values(?,?,?,?)";
    	final Order temp = entity;
    	
		KeyHolder keyHolder = new GeneratedKeyHolder();
		this.jdbcTemplate.update(
		    new PreparedStatementCreator() {
		        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
		            PreparedStatement ps = connection.prepareStatement(INSERT_SQL, new String[] {"id"});
		            ps.setString(1, temp.getCustomerName());	
		            ps.setDouble(2, temp.getExpenditure());
		            ps.setString(3, temp.getDishName());
		            ps.setInt(4, temp.getDishCount());
		            return ps;
		        }
		    },
		    keyHolder);
	}

}
