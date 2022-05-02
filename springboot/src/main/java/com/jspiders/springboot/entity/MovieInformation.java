package com.jspiders.springboot.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
 
@Entity
@Table(name="movie_info")
public class MovieInformation implements Serializable {
	
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="id")
	private Long id;
	
	@Column(name="moviename")
	private String movieName;
	
	@Column(name="actorname")
	private String actorName;
	
	@Column(name="actressname")
	private String actressName;
	
	@Column(name="releasedate")
	private Date releaseDate;
	
	@Column(name="budget")
	private Double budget;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}





	public String getMovieName() {
		return movieName;
	}





	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}





	public String getActorName() {
		return actorName;
	}





	public void setActorName(String actorName) {
		this.actorName = actorName;
	}





	public String getActressName() {
		return actressName;
	}





	public void setActressName(String actressName) {
		this.actressName = actressName;
	}





	public Date getReleaseDate() {
		return releaseDate;
	}





	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}


	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "MovieInformation [id=" + id + ", movieName=" + movieName + ", actorName=" + actorName + ", actressName="
				+ actressName + ", releaseDate=" + releaseDate + ", budget=" + budget + "]";
	}



}
