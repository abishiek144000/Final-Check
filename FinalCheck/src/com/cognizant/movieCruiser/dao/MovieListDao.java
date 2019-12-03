package com.cognizant.movieCruiser.dao;

import java.util.List;

import com.cognizant.movieCruiser.model.MovieList;

public interface MovieListDao {
	List<MovieList> getMovieListAdmin();

	List<MovieList> getMovieListCustomer();

	void modifyMenuItem(MovieList movieList);

	MovieList getMovieList(long movieListId);

}
