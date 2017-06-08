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
	
	@Column(name = "name")
	private String name = null;
	
	@Column(name = "seating")
	private String seating = null;
	
	@Column(name = "play_time")
	private String play_time = null;
	
	@Column(name = "ticket_count")
	private Integer ticket_count = null;
	
	public Order() {
        super();
    }

    public Order(final Integer id, final String customerName, final Double expenditure,
    		final String movieName, final String movieSeating, final String movieTime, final Integer ticketCount) {
		this.id = id;
    	this.customer_name = customerName;
		this.expenditure = expenditure;
		this.name = movieName;
		this.seating = movieSeating;
		this.play_time = movieTime;
		this.ticket_count = ticketCount;
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
    
    public void setMovieName(String name) {
		this.name = name;
	}
    
    public String getMovieName() {
		return this.name;
	}
    
    public void setMovieSeating (String movieSeating) {
		this.seating = movieSeating;
	}
    
    public String getMovieSeating() {
		return this.seating;
	}
    
    public void setPlayTime(String play_time) {
		this.play_time = play_time;
	}
    
    public String getPlayTime() {
		return this.play_time;
	}
    
    public Integer getTicketCount() {
        return this.ticket_count;
    }
    public void setTicketCount(final Integer ticketCount) {
        this.ticket_count = ticketCount;
    }
}
