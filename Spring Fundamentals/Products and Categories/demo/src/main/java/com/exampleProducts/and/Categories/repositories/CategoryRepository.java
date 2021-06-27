package com.exampleProducts.and.Categories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exampleProducts.and.Categories.models.Category;
import com.exampleProducts.and.Categories.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
 List<Category> findAll();
 List<Category> findByProductsNotContains(Product product);
 }


