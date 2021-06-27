package com.exampleProducts.and.Categories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exampleProducts.and.Categories.models.Category;
import com.exampleProducts.and.Categories.models.Product;
import com.exampleProducts.and.Categories.models.categories;
import com.exampleProducts.and.Categories.repositories.CategoryRepository;
import com.exampleProducts.and.Categories.repositories.catagoriesREpository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository;
	private final catagoriesREpository catagoriesREp;

	
	

	public CategoryService(CategoryRepository categoryRepository, catagoriesREpository catagoriesREp) {
		super();
		this.categoryRepository = categoryRepository;
		this.catagoriesREp = catagoriesREp;
	}

	public List<Category> allCategory() {
		return categoryRepository.findAll();
	}

	public Category createCategory(Category category) {

		return categoryRepository.save(category);
	}

	public Category findCategory(Long id) {
		Optional<Category> optionalCategory = categoryRepository.findById(id);
		if (optionalCategory.isPresent()) {
			return optionalCategory.get();
		} else {
			return null;
		}
	}
	
	public List<Category> withoutProductsCategory(Product product) {
		return categoryRepository. findByProductsNotContains(product);
	}

	public categories createCategory(categories category) {

		return catagoriesREp.save(category);
	}
	




}
