package com.collabera.store.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "game")
public class Game implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="gameID")
	private Long gameID;
	
	private String title;
	private String category1;
	private String category2;
	private String description;
	private Double price;
	private String image;
	
	@ManyToOne
	@JoinColumn(name = "developed", referencedColumnName = "developerID")
	private Developer developed;
	
	//@OneToMany(mappedBy = "ratingID", cascade = CascadeType.ALL, orphanRemoval = true)
	//private Set<Rating> ratings;
	@OneToOne
	@JoinColumn(name = "ratingID")
	private Rating ratings;
	
	public Long getId() {
		return gameID;
	}

	public void setId(Long id) {
		this.gameID = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory1() {
		return category1;
	}

	public void setCategory1(String category1) {
		this.category1 = category1;
	}

	public String getCategory2() {
		return category2;
	}

	public void setCategory2(String category2) {
		this.category2 = category2;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Developer getDeveloped() {
		return developed;
	}

	public void setDeveloper(Developer developed) {
		this.developed = developed;
	}

	public Long getGameID() {
		return gameID;
	}

	public void setGameID(Long gameID) {
		this.gameID = gameID;
	}

	public Rating getRatings() {
		return ratings;
	}

	public void setRatings(Rating ratings) {
		this.ratings = ratings;
	}

	public void setDeveloped(Developer developed) {
		this.developed = developed;
	}

//	public Set<Rating> getRatings() {
//		return ratings;
//	}
//
//	public void setRatings(Set<Rating> ratings) {
//		this.ratings = ratings;
//	}

	
}
