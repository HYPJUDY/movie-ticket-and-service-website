package com.team.legendary.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
	@Column(name = "cname")
    private String cname = null;
	
	@Column(name="password")
	private String password = null;
	
	public Customer() {
        super();
    }
	
	public Customer(String cname, String password) {
		this.cname = cname;
		this.password = password;
	}

    public String getCname() {
        return this.cname;
    }
    public void setCname(final String cname) {
        this.cname = cname;
    }
    
    public String getPassword() {
        return this.password;
    }
    public void setPassword(final String password) {
        this.password = password;
    }
    
}
