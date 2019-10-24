package com.collabera.store.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="developer")
public class Developer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "developerID")
	private Long developerID;
	
	private String developerName;
	
	@OneToMany(mappedBy = "developed", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Game> game;

	public Long getDeveloperID() {
		return developerID;
	}

	public void setDeveloperID(Long developerID) {
		this.developerID = developerID;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	public Set<Game> getGame() {
		return game;
	}

	public void setGame(Set<Game> game) {
		this.game = game;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
