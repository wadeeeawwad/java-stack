package com.exampleProducts.and.Categories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exampleProducts.and.Categories.models.Dojo;
import com.exampleProducts.and.Categories.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepository;

	public DojoService(DojoRepository dojoRepository) {
		
		this.dojoRepository = dojoRepository;
	}
	public List<Dojo> allPersons() {
		return dojoRepository.findAll();
	}
	public Dojo createdojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	public Dojo finddojo(Long id) {
		Optional<Dojo> optionaldojo = dojoRepository.findById(id);
		if (optionaldojo.isPresent()) {
			return optionaldojo.get();
		} else {
			return null;
		}
	}
	public List<Dojo> withoutNinjaDojo(){
		return dojoRepository.findByNinjasIsNull();
		
	}
	
}
