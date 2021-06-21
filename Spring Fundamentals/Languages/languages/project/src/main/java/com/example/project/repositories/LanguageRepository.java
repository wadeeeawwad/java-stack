package com.example.project.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.models.language;
import com.sun.xml.bind.v2.model.core.ID;

@Repository
public interface LanguageRepository extends CrudRepository<language, Long> {//language name of class in model

	 List<language> findAll();
	    // this method finds books with descriptions containing the search string
	 Optional<language> findById(ID id);

	// this method finds books by id Retrieves an entity by its id.
	
	
}
