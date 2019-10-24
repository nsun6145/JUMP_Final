package com.collabera.store.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.store.model.Developer;
import com.collabera.store.repository.DeveloperRepository;

@RestController
public class DeveloperController {

	@Autowired
	private DeveloperRepository devRepo;
	
	
	@GetMapping("/api/developers/{id}")
	public Developer getDevById(@PathVariable String id){
		Long input = Long.parseLong(id); 
		Optional<Developer> dev = devRepo.findById(input);
		if(dev.isPresent()) 
			return dev.get();
		else
			return null;
	}
	
	@GetMapping("/api/developers")
	public List<Developer> getDevelopers(){
		return devRepo.findAll();
	}
	
}
