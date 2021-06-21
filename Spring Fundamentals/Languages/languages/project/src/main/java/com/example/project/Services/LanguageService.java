package com.example.project.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.project.models.language;
import com.example.project.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepository;

	public LanguageService(LanguageRepository languageRepository) {// constructor for LanguageRepository
		this.languageRepository = languageRepository;
	}

	public List<language> getAllLanguages() {
		return languageRepository.findAll();

	}

	public language addlanguage(language objectlang) {

		return languageRepository.save(objectlang);

	}
	public language findlanguage(long id) {
		Optional<language> optionallanguage=languageRepository.findById(id);
		if(optionallanguage.isPresent()) {
			return optionallanguage.get();
			
			
		}else
			return null;

	}
	

	public language UpdateLanguage(language objectlang) {
		language updatethelanguage=findlanguage(objectlang.getId());
		updatethelanguage.setName(objectlang.getName());
		updatethelanguage.setCreation(objectlang.getCreation());
		updatethelanguage.setVersion(objectlang.getVersion());
	    	
	    	return languageRepository.save(updatethelanguage);
	    	
	    
	}
	public void deletelanguage(Long id) {
		
		 languageRepository.deleteById(id);
		
		
	}
	     
	        
	        
	    
	   }
