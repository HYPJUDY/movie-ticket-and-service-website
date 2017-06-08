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
	
	@Column(name = "cname")
	private String cname = null;
	
	@Column(name = "expenditure")
	private Double expenditure = null;
	
	@Column(name = "mname")
	private String mname = null;
	
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
    		final String movieName, final String movieSeating, final String movieTime, final Integer count) {
		this.id = id;
    	this.cname = customerName;
		this.expenditure = expenditure;
		this.mname = movieName;
		this.seating = movieSeating;
		this.time = movieTime;
		this.count = count;
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
    
    public void setCname(String cname) {
		this.cname = cname;
	}
    
    public String getCname() {
		return this.cname;
	}
    
    public void setMname(String mname) {
		this.mname = mname;
	}
    
    public String getMname() {
		return this.mname;
	}
    
    public void setSeating (String seating) {
		this.seating = seating;
	}
    
    public String getSeating() {
		return this.seating;
	}
    
    public void setTime(String time) {
		this.time = time;
	}
    
    public String getTime() {
		return this.time;
	}
    
    public Integer getCount() {
        return this.count;
    }
    public void setCount(final Integer count) {
        this.count = count;
    }
}
