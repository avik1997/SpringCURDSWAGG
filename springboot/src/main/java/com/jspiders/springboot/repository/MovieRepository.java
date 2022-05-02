package com.jspiders.springboot.repository;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jspiders.springboot.entity.MovieInformation;


@Repository
public interface MovieRepository  extends JpaRepository<MovieInformation, Long>{

	@Query("from MovieInformation where movieName=:movieName")
	MovieInformation findByMovieName(@PathParam("movieName") String movieName);
}
