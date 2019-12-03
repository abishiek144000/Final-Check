package com.cognizant.movieCruiser.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.movieCruiser.model.MovieList;
import com.cognizant.movieCruiser.util.DateUtil;

public class MovieListDaoCollectionImplTest {

	public static void main(String args[]) throws ParseException {
		testModifyMovieList();
		testGetMovieListAdmin();
		testGetMovieListCustomer();
	}

	public static void testGetMovieListAdmin() {
		MovieListDaoCollectionImpl movie = new MovieListDaoCollectionImpl();
		System.out.println();
		System.out.println("MENU ITEM LIST: ");

		List<MovieList> movieList = movie.getMovieListAdmin();
		for (MovieList movie_list : movieList) {
			System.out.println(movie_list.toString());
		}
	}

	public static void testGetMovieListCustomer() {
		MovieListDaoCollectionImpl movie = new MovieListDaoCollectionImpl();
		System.out.println();
		System.out.println("CUSTOMER MENU ITEM LIST: ");

		List<MovieList> movielist1 = movie.getMovieListCustomer();
		for (MovieList movie_list1 : movielist1) {
			System.out.println(movie_list1.toString());
		}
	}

	public static void testModifyMovieList() throws ParseException {

		MovieList movielist = new MovieList(0000005, "Thani oruvan", 30000000, true,
				DateUtil.convertToDate("22/11/2017"), "Crime", true);
		MovieListDaoCollectionImpl movielistcollectionimpl = new MovieListDaoCollectionImpl();

		MovieListDao movielistdao = movielistcollectionimpl;
		movielistdao.modifyMenuItem(movielist);
		System.out.println("Modify Menu Item: "
				+ movielistdao.getMovieList(0000005));

	}

	public void testGetMenuItem() {

	}

}
