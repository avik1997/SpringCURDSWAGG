package com.jspiders.springboot.moviedto;

import java.io.Serializable;
import java.sql.Date;


public class MovieDto implements Serializable {

	private String movieName;
	
	private String actorName;
	
	private String actressName;
	
	private Date releaseDate;
	
	private Double budget;

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
		return "MovieDto [movieName=" + movieName + ", actorName=" + actorName + ", actressName=" + actressName
				+ ", releaseDate=" + releaseDate + ", budget=" + budget + "]";
	}

	
	
	

}
