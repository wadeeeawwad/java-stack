package com.exampleProducts.and.Categories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exampleProducts.and.Categories.models.Dojo;
import com.exampleProducts.and.Categories.models.Ninja;
import com.exampleProducts.and.Categories.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;

	public NinjaService(NinjaRepository ninjaRepository) {

		this.ninjaRepository = ninjaRepository;
	}

	public List<Ninja> allNinjas() {
		return ninjaRepository.findAll();
	}

	public Ninja createninja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}

	public Ninja findninja(Long id) {
		Optional<Ninja> optionalninja = ninjaRepository.findById(id);
		if (optionalninja.isPresent()) {
			return optionalninja.get();
		} else {
			return null;
		}
	}

//	public List<Ninja> allPersons() {
//		return ninjaRepository.findAll();
//	}

}
