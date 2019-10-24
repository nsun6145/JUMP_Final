package com.collabera.store.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.store.model.Developer;
import com.collabera.store.model.Game;
import com.collabera.store.repository.DeveloperRepository;
import com.collabera.store.repository.GameRepository;

@RestController
public class GameController {

	@Autowired
	private GameRepository gameRepo;
	
	@GetMapping("/api/games/{id}")
	public Game getGameById(@PathVariable String id) {
		Long input = Long.parseLong(id);
		Optional<Game> game = gameRepo.findById(input);
		if(game.isPresent())
			return game.get();
		else
			return null;
	}
	
	@GetMapping("/api/games")
	public List<Game> getAllGames(){
		return gameRepo.findAll();
	}
	
}
