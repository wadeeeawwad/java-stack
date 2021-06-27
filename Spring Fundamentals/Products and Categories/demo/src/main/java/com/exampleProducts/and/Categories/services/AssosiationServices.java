package com.exampleProducts.and.Categories.services;

import org.springframework.stereotype.Service;

import com.exampleProducts.and.Categories.models.categories;
import com.exampleProducts.and.Categories.repositories.catagoriesREpository;

@Service
public class AssosiationServices {
	private final catagoriesREpository catagoriesRepo;

	public AssosiationServices(catagoriesREpository catagoriesRepo) {
		
		this.catagoriesRepo = catagoriesRepo;
	}
	
	
	
	public categories createCategory(categories categ) {

		return catagoriesRepo.save(categ);
	}



	
	public categories createAssociation(categories asso) {
		return catagoriesRepo.save(asso);
	}
	
	

	
	
	
}
