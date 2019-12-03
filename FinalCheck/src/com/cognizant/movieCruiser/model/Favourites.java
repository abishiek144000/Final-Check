package com.cognizant.movieCruiser.model;

import java.util.List;

public class Favourites {

	private List<MovieList> movieList;

	private int noOfFavourites;

	public List<MovieList> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<MovieList> movieList) {
		this.movieList = movieList;
	}

	public int getNoOfFavourites() {
		return noOfFavourites;
	}

	public void setNoOfFavourites(int noOfFavourites) {
		this.noOfFavourites = noOfFavourites;
	}

	@Override
	public String toString() {
		return "Favourites [movieList=" + movieList + ", noOfFavourites="
				+ noOfFavourites + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((movieList == null) ? 0 : movieList.hashCode());
		result = prime * result + noOfFavourites;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Favourites other = (Favourites) obj;
		if (movieList == null) {
			if (other.movieList != null)
				return false;
		} else if (!movieList.equals(other.movieList))
			return false;
		if (noOfFavourites != other.noOfFavourites)
			return false;
		return true;
	}

	public Favourites(List<MovieList> movieList, int noOfFavourites) {
		super();
		this.movieList = movieList;
		this.noOfFavourites = noOfFavourites;
	}

}
