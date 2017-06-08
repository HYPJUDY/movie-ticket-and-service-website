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

    @Column(name = "movie_name")
    private String movie_name = null;

    @Column(name = "price")
    private Double price = null;

    @Column(name="description")
    private String description = null;

    @Column(name="poster")
    private String poster = null;
    
    @Column(name="avg_rating")
    private Double avg_rating = null;
    
    @Column(name="cast")
    private String cast = null;
    
    @Column(name="direction")
    private String direction = null;
    
    @Column(name="genre")
    private String genre = null;
    
    @Column(name="duration")
    private Integer duration = null;

	/*@Column(name = "instock")
    private boolean inStock = false;*/

    public Movie() {
        super();
    }
    public Movie(final Integer id, final String movieName, final Double price, final String description, final String moviePoster,
    		final Double movieAvgRating, final String movieCast, final String movieDirection, final String movieGenre, final Integer movieDuration) {
        super();
        this.id = id;
        this.movie_name = movieName;
        this.price = price;
        this.description = description;
        this.poster = moviePoster;
        
        this.avg_rating = movieAvgRating;
        this.cast = movieCast;
        this.direction = movieDirection;
        this.genre = movieGenre;
        this.duration = movieDuration;
    }


    public Integer getId() {
        return this.id;
    }
    public void setId(final Integer id) {
        this.id = id;
    }


    public String getName() {
        return this.movie_name;
    }
    public void setName(final String movieName) {
        this.movie_name = movieName;
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
        return poster;
    }

    public void setPoster(String pic) {
        this.poster = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Double getAvgRating() {
        return this.avg_rating;
    }

    public void setAvgRating(Double movieAvgRating) {
        this.avg_rating = movieAvgRating;
    }
    
    public String getCast() {
        return this.cast;
    }

    public void setCast(String description) {
        this.cast = description;
    }
    
    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String movieDirection) {
        this.direction = movieDirection;
    }
    
    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String movieGenre) {
        this.genre = movieGenre;
    }
    
    public Integer getDuration() {
        return this.duration;
    }

    public void setDuration(Integer movieDuration) {
        this.duration = movieDuration;
    }
}













