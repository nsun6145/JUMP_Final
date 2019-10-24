package com.collabera.store.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.collabera.store.model.Developer;
import com.collabera.store.model.Game;
@Repository
public interface GameRepository extends JpaRepository<Game,Long> {
	
	public Game findByTitle(String name);
	Optional <Game> findById(Long id);
	//List<Game> findByDeveloper(String dev);
	List<Game> findAll();
	
}
