package com.team.legendary.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Null;

@Entity
public class Movie implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id = null;

    @Column(name = "mname")
    private String mname = null;

    @Column(name = "price")
    private Double price = null;

    @Column(name="description")
    private String description = null;

    @Column(name="poster")
    private String poster = null;
    
    @Column(name="rating")
    private Double rating = null;
    
    @Column(name="cast")
    private String cast = null;
    
    @Column(name="direction")
    private String direction = null;
    
    @Column(name="genre")
    private String genre = null;
    
    @Column(name="duration")
    private Integer duration = null;

	@Column(name = "time")
    private String time = null;
	
	@Column(name = "trailer")
	private String trailer = null;

    public Movie() {
        super();
    }
    public Movie(final Integer id, final String mname, final Double price, final String description,
    		final String poster,final Double rating, final String cast, final String direction,
    		final String genre, final Integer duration, final String time, final String trailer) {
        super();
        this.id = id;
        this.mname = mname;
        this.price = price;
        this.description = description;
        this.poster = poster;
        
        this.rating = rating;
        this.cast = cast;
        this.direction = direction;
        this.genre = genre;
        this.duration = duration;
        this.time = time;
        this.trailer = trailer;
    }


    public Integer getId() {
        return this.id;
    }
    public void setId(final Integer id) {
        this.id = id;
    }


    public String getMname() {
        return this.mname;
    }
    public void setMname(final String mname) {
        this.mname = mname;
    }


    public Double getPrice() {
        return this.price;
    }
    public void setPrice(final Double price) {
        this.price = price;
    }


    public String getDescription() {
        return this.description;
    }
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
    
    public Double getRating() {
        return this.rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
    
    public String getCast() {
        return this.cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }
    
    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    
    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public Integer getDuration() {
        return this.duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public String getTrailer() {
        return this.trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}













