package com.team.restaurant_second.persistence.entity;

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
	
	@Column(name = "dishName")
	private String dishName = null;
	
	@Column(name = "dishCount")
	private Integer dishCount = null;
	
	public Order() {
        super();
    }

    public Order(final Integer id, final String customerName, final Double expenditure, final String dishName, final Integer dishCount) {
		this.id = id;
    	this.customerName = customerName;
		this.expenditure = expenditure;
		this.dishName = dishName;
		this.dishCount = dishCount;
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
    
    public void setDishName(String dishName) {
		this.dishName = dishName;
	}
    
    public String getDishName() {
		return this.dishName;
	}
    
    public void setDishCount (Integer dishCount) {
		this.dishCount = dishCount;
	}
    
    public Integer getDishCount() {
		return this.dishCount;
	}
    
}
