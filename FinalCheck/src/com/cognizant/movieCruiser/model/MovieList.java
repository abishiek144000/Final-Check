package com.cognizant.movieCruiser.model;

import java.util.Date;

public class MovieList {
	private long id;

	private String title;
	private float boxOffice;
	private boolean active;
	private Date date;
	private String genre;
	private boolean hasTeaser;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(float boxOffice) {
		this.boxOffice = boxOffice;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean isHasTeaser() {
		return hasTeaser;
	}

	public void setHasTeaser(boolean hasTeaser) {
		this.hasTeaser = hasTeaser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result + Float.floatToIntBits(boxOffice);
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + (hasTeaser ? 1231 : 1237);
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		MovieList other = (MovieList) obj;
		if (active != other.active)
			return false;
		if (Float.floatToIntBits(boxOffice) != Float
				.floatToIntBits(other.boxOffice))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (hasTeaser != other.hasTeaser)
			return false;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MovieList [id=" + id + ", title=" + title + ", boxOffice="
				+ boxOffice + ", active=" + active + ", date=" + date
				+ ", genre=" + genre + ", hasTeaser=" + hasTeaser + "]";
	}

	public MovieList(long id, String title, float boxOffice, boolean active,
			Date date, String genre, boolean hasTeaser) {
		super();
		this.id = id;
		this.title = title;
		this.boxOffice = boxOffice;
		this.active = active;
		this.date = date;
		this.genre = genre;
		this.hasTeaser = hasTeaser;
	}

}
