package com.team.legendary.persistence.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id = null;
	
	@Column(name = "customer_name")
	private String customer_name = null;
	
	@Column(name = "expenditure")
	private Double expenditure = null;
	
	@Column(name = "movie_name")
	private String movie_name = null;
	
	@Column(name = "seating")
	private String seating = null;
	
	@Column(name = "time")
	private String time = null;
	
	@Column(name = "count")
	private Integer count = null;
	
	public Order() {
        super();
    }

    public Order(final Integer id, final String customerName, final Double expenditure,
    		final String movieName, final String movieSeating, final String movieTime, final Integer ticketCount) {
		this.id = id;
    	this.customer_name = customerName;
		this.expenditure = expenditure;
		this.movie_name = movieName;
		this.seating = movieSeating;
		this.time = movieTime;
		this.count = ticketCount;
	}
	
    public Integer getId() {
        return this.id;
    }
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public void setExpenditure (Double expenditure) {
		this.expenditure = expenditure;
	}
    
    public Double getExpenditure() {
		return this.expenditure;
	}
    
    public void setCustomerName(String customerName) {
		this.customer_name = customerName;
	}
    
    public String getCustomerName() {
		return this.customer_name;
	}
    
    public void setMovieName(String movie_name) {
		this.movie_name = movie_name;
	}
    
    public String getMovieName() {
		return this.movie_name;
	}
    
    public void setMovieSeating (String movieSeating) {
		this.seating = movieSeating;
	}
    
    public String getMovieSeating() {
		return this.seating;
	}
    
    public void setPlayTime(String play_time) {
		this.time = play_time;
	}
    
    public String getPlayTime() {
		return this.time;
	}
    
    public Integer getCount() {
        return this.count;
    }
    public void setCount(final Integer ticketCount) {
        this.count = ticketCount;
    }
}
