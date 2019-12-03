package com.cognizant.movieCruiser.dao;

public class FavouriteEmptyException extends Exception {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public FavouriteEmptyException(String message) {
		super();
		this.message = message;
	}
}
