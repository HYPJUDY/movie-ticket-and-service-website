package com.team.legendary.persistence.entity;

import java.io.Serializable;
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
	
	@Column(name = "customerName")
	private String customerName = null;
	
	@Column(name = "expenditure")
	private Double expenditure = null;
	
	@Column(name = "movieName")
	private String movieName = null;
	
	@Column(name = "movieSeating")
	private String movieSeating = null;
	
	public Order() {
        super();
    }

    public Order(final Integer id, final String customerName, final Double expenditure, final String movieName, final String movieSeating) {
		this.id = id;
    	this.customerName = customerName;
		this.expenditure = expenditure;
		this.movieName = movieName;
		this.movieSeating = movieSeating;
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
		this.customerName = customerName;
	}
    
    public String getCustomerName() {
		return this.customerName;
	}
    
    public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
    
    public String getMovieName() {
		return this.movieName;
	}
    
    public void setMovieSeating (String movieSeating) {
		this.movieSeating = movieSeating;
	}
    
    public String getMovieSeating() {
		return this.movieSeating;
	}
    
}
