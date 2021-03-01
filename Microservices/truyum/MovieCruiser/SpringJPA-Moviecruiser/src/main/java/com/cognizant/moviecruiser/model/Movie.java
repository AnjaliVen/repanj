package com.cognizant.moviecruiser.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "boxoff")
	private String boxOffice;
	
	@Column(name = "active")
	private String active;
	
	@Column(name = "dateoflaunch")
	private Date dateOfLaunch;
	
	@Column(name = "genre")
	private String genre;
	
	@Column(name = "hasteaser")
	private String hasTeaser;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(String boxOffice) {
		this.boxOffice = boxOffice;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}

	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getHasTeaser() {
		return hasTeaser;
	}

	public void setHasTeaser(String hasTeaser) {
		this.hasTeaser = hasTeaser;
	}

	@OneToMany(mappedBy = "movie", fetch = FetchType.EAGER)
	private List<Favorites> favorites;

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", boxOffice=" + boxOffice + ", active=" + active
				+ ", dateOfLaunch=" + dateOfLaunch + ", genre=" + genre + ", hasTeaser=" + hasTeaser + ", favorites="
				+ favorites + "]";
	}
	

}