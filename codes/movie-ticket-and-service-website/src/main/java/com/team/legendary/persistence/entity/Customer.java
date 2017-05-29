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
	@Column(name = "customerName")
    private String name = null;
	
	@Column(name="password")
	private String password = null;
	
	public Customer() {
        super();
    }
	
	public Customer(String name, String password) {
		this.name = name;
		this.password = password;
	}

    public String getName() {
        return this.name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return this.password;
    }
    public void setPassword(final String password) {
        this.password = password;
    }
    
}
