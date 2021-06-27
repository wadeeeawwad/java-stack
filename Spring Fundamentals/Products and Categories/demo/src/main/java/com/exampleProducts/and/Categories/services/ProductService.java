package com.exampleProducts.and.Categories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exampleProducts.and.Categories.models.Category;
import com.exampleProducts.and.Categories.models.Product;
import com.exampleProducts.and.Categories.repositories.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	public List<Product> allProducts() {
		return productRepository.findAll();
	}

	public Product createProduct(Product product) {

		return productRepository.save(product);
	}

	public Product findProduct(Long id) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		if (optionalProduct.isPresent()) {
			return optionalProduct.get();
		} else {
			return null;
		}
	}

	public List<Product> findByCategoriesIsNull(Category category) {
		return productRepository.findByCategoriesNotContains(category);
	}

}
