package com.jspiders.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springboot.entity.MovieInformation;
import com.jspiders.springboot.moviedto.MovieDto;
import com.jspiders.springboot.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	/*
	 * SAVE MOVIE INFORMATION
	 */
	public void saveMovieInfo(MovieInformation movieInformation) {
		movieRepository.save(movieInformation);
	}
	
	/*
	 * GET ALL MOVIE INFORMATION
	 */
	public List<MovieInformation> getAllMovieInformation()
	{
		return movieRepository.findAll();
	}
	
	/*
	 * GET MOVIE BY ID
	 */
	public  MovieInformation getMovieByName(String movieName) {
		
		return movieRepository.findByMovieName(movieName);
		
	}
	/*
	 * GET MOVIE BY USING ID
	 */
	public Optional<MovieInformation> getMovieById(Long id)
	{
		return movieRepository.findById(id);
	}
	
	/*
	 * UPDATE
	 */
	public void updateMovieById(MovieDto movieDto,Long id)
	{
	 Optional<MovieInformation> movieById = getMovieById(id);
	 MovieInformation information = movieById.get();
	 information.setMovieName(movieDto.getMovieName());
	 information.setActorName(movieDto.getActorName());
	 information.setActressName(movieDto.getActressName());
	 information.setBudget(movieDto.getBudget());
	 information.setReleaseDate(movieDto.getReleaseDate());
	 movieRepository.save(information);
	
	}

	public void deleteMovie(Long id) {
		
		movieRepository.deleteById(id);
	}
	
	/*
	 * 
	 */
}
