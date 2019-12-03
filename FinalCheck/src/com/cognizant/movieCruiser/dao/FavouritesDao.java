package com.cognizant.movieCruiser.dao;

import java.util.List;

import com.cognizant.movieCruiser.model.MovieList;

public interface FavouritesDao {

	void addFavouriteList(long userId, long movieListId);

	List<MovieList> getAllFavouriteList(long userId)
			throws FavouriteEmptyException;

	void removeFavouriteList(long userId, long movieListId);

}
