package com.collabera.store.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.collabera.store.model.Developer;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long>{
	
	public Developer findByDeveloperName(String developerName);
	Optional<Developer> findById(Long id);
	List<Developer> findAll(); 
}
