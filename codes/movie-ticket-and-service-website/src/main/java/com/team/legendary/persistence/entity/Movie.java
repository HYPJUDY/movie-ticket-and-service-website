package com.team.legendary.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    @Column(name = "movieName")
    private String movieName = null;

    @Column(name = "price")
    private Double price = null;

    @Column(name="description")
    private String description = null;

    @Column(name="moviePoster")
    private String moviePoster = null;
    
    @Column(name="movieAvgRating")
    private Double movieAvgRating = null;
    
    @Column(name="movieCast")
    private String movieCast = null;
    
    @Column(name="movieDirection")
    private String movieDirection = null;
    
    @Column(name="movieGenre")
    private String movieGenre = null;
    
    @Column(name="movieDuration")
    private Integer movieDuration = null;

	/*@Column(name = "instock")
    private boolean inStock = false;*/

    public Movie() {
        super();
    }
    public Movie(final Integer id, final String movieName, final Double price, final String description, final String moviePoster,
    		final Double movieAvgRating, final String movieCast, final String movieDirection, final String movieGenre, final Integer movieDuration) {
        super();
        this.id = id;
        this.movieName = movieName;
        this.price = price;
        this.description = description;
        this.moviePoster = moviePoster;
        
        this.movieAvgRating = movieAvgRating;
        this.movieCast = movieCast;
        this.movieDirection = movieDirection;
        this.movieGenre = movieGenre;
        this.movieDuration = movieDuration;
    }


    public Integer getId() {
        return this.id;
    }
    public void setId(final Integer id) {
        this.id = id;
    }


    public String getName() {
        return this.movieName;
    }
    public void setName(final String movieName) {
        this.movieName = movieName;
    }


    public Double getPrice() {
        return this.price;
    }
    public void setPrice(final Double price) {
        this.price = price;
    }


    public String getDescrition() {
        return this.description;
    }
    public void setDescrition(final String description) {
        this.description = description;
    }

    /*public boolean isInStock() {
        return this.inStock;
    }
    public void setInStock(final boolean inStock) {
        this.inStock = inStock;
    }*/

    public String getPoster() {
        return moviePoster;
    }

    public void setPoster(String pic) {
        this.moviePoster = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Double getAvgRating() {
        return this.movieAvgRating;
    }

    public void setAvgRating(Double movieAvgRating) {
        this.movieAvgRating = movieAvgRating;
    }
    
    public String getCast() {
        return this.movieCast;
    }

    public void setCast(String description) {
        this.description = description;
    }
    
    public String getDirection() {
        return this.movieDirection;
    }

    public void setDirection(String movieDirection) {
        this.movieDirection = movieDirection;
    }
    
    public String getGenre() {
        return this.movieGenre;
    }

    public void setGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }
    
    public Integer getDuration() {
        return this.movieDuration;
    }

    public void setDuration(Integer movieDuration) {
        this.movieDuration = movieDuration;
    }
}













