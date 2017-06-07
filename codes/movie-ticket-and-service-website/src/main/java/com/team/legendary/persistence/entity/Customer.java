package com.team.legendary.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    @Id
	@Column(name = "customer_name")
    private String customerName = null;
	
	@Column(name="password")
	private String password = null;
	
	public Customer() {
        super();
    }
	
	public Customer(String customerName, String password) {
		this.customerName = customerName;
		this.password = password;
	}

    public String getCustomerName() {
        return this.customerName;
    }
    public void setCustomerName(final String customerName) {
        this.customerName = customerName;
    }
    
    public String getPassword() {
        return this.password;
    }
    public void setPassword(final String password) {
        this.password = password;
    }
    
}
