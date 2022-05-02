package com.jspiders.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.springboot.constants.AppConstants;
import com.jspiders.springboot.entity.MovieInformation;
import com.jspiders.springboot.moviedto.MovieDto;
import com.jspiders.springboot.service.MovieService;


@Controller
@RestController
@RequestMapping(value=AppConstants.MOVIE_CONTROLLER)
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	
	@PostMapping(value=AppConstants.SAVE_MOVIE_INFO)
	public void saveMovieInfo(@RequestBody MovieInformation movieInformation)
	{
		movieService.saveMovieInfo(movieInformation);
	}

	@GetMapping(value = AppConstants.GET_ALL_MOVIE_INFO)
	public @ResponseBody List<MovieInformation> getAllMovieInformation()
	{
		return movieService.getAllMovieInformation();
	}
	@GetMapping(value=AppConstants.GET_MOVIE_BY_NAME)
	public @ResponseBody  MovieInformation getMovieByName(String movieName) {
		
		return movieService.getMovieByName(movieName);
		
	}
	@PostMapping(value=AppConstants.UPDATE_MOVIE_BY_ID)
	public void updateMovieById(@RequestBody  MovieDto movieDto, Long id) {
		movieService.updateMovieById(movieDto, id);
	}
	@DeleteMapping(value=AppConstants.DELETE_MOVIE_BY_NAME)
	public void deleteMovieByName(@RequestBody  MovieDto movieDto, Long id) {
		movieService.deleteMovie(id);
	}
}
