package com.cognizant.movieCruiser.dao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.movieCruiser.model.MovieList;
import com.cognizant.movieCruiser.util.DateUtil;

public class MovieListDaoCollectionImpl implements MovieListDao {

	static List<MovieList> movieList;

	public MovieListDaoCollectionImpl() {
		if (movieList == null) {
			try {
				movieList = new ArrayList<MovieList>();

				movieList.add(new MovieList(0000001, "Titanic", 2187463944f,
						true, DateUtil.convertToDate("15/03/1990"),
						"Science Fiction", true));
				movieList.add(new MovieList(0000002, "Jurassic World",
						1671713208f, true,
						DateUtil.convertToDate("23/12/2017"), "Superhero",
						false));
				movieList.add(new MovieList(0000003, "Avatar", 278965087f,
						true, DateUtil.convertToDate("21/08/2012"), "Romance",
						false));
				movieList.add(new MovieList(0000004, "The Avengers",
						1518812988f, false, DateUtil
								.convertToDate("02/07/2017"),
						"Science Fiction", true));
				movieList
						.add(new MovieList(0000005, "Avengers:End Game",
								2750760348f, true, DateUtil
										.convertToDate("12/07/2022"),
								"Superhero", true));

			} catch (ParseException e) {
				System.out.println("ParseException" + e.getMessage());
			}
		}

	}

	public List<MovieList> getMovieListAdmin() {
		return movieList;

	}

	public List<MovieList> getMovieListCustomer() {
		List<MovieList> movieListCust = new ArrayList<MovieList>();
		Date today = new Date();
		for (MovieList movieList1 : movieList) {
			if (movieList1.getDate().getTime() <= today.getTime()
					&& movieList1.isActive()) {
				movieListCust.add(movieList1);
			}
		}

		return movieListCust;

	}

	@Override
	public void modifyMenuItem(MovieList movieList2) {
		// TODO Auto-generated method stub

		for (MovieList movieListModify : movieList) {
			if (movieList2.getId() == movieListModify.getId()) {
				movieListModify.setTitle(movieList2.getTitle());
				movieListModify.setBoxOffice(movieList2.getBoxOffice());
				movieListModify.setActive(movieList2.isActive());
				movieListModify.setDate(movieList2.getDate());
				movieListModify.setGenre(movieList2.getGenre());
				movieListModify.setHasTeaser(movieList2.isHasTeaser());
			}
		}

	}

	@Override
	public MovieList getMovieList(long movieListId) {
		// TODO Auto-generated method stub

		for (MovieList movie_List : movieList) {
			if (movieListId == movie_List.getId()) {
				return movie_List;
			}
		}

		return null;

	}

}
