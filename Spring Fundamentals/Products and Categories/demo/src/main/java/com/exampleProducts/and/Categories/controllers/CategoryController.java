package com.exampleProducts.and.Categories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exampleProducts.and.Categories.models.Category;
import com.exampleProducts.and.Categories.models.Product;
import com.exampleProducts.and.Categories.models.categories;
import com.exampleProducts.and.Categories.services.AssosiationServices;
import com.exampleProducts.and.Categories.services.CategoryService;
import com.exampleProducts.and.Categories.services.ProductService;

@Controller
public class CategoryController {
	private final ProductService productService;
	private final CategoryService categoryService;
	private final AssosiationServices Asses;
	


	

	public CategoryController(ProductService productService, CategoryService categoryService,
			AssosiationServices asses) {
		super();
		this.productService = productService;
		this.categoryService = categoryService;
		Asses = asses;
	}

	@RequestMapping("/category/new")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "/category/newcategory.jsp";
	}

	@RequestMapping(value = "/category/new", method = RequestMethod.POST)
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "/newcategory.jsp";
		} else {
			categoryService.createCategory(category);
			return "redirect:/category/new";
		}

	}

	@RequestMapping("/category/{id}")
	public String show(@ModelAttribute("acategories") categories acategories, @PathVariable("id") Long id,
			Model model) {
		Category category = categoryService.findCategory(id);
		List<Product> product =productService.findByCategoriesIsNull(category);
		model.addAttribute("product", product);
		model.addAttribute("category", category);
		return "/category/show.jsp";
	}
	
	@RequestMapping(value = "/category/{id}", method = RequestMethod.POST)

     public String createAss(@Valid @ModelAttribute("categories") categories categories, BindingResult result) {
		if (result.hasErrors()) {
			return "/newcategory.jsp";
		} else {
			Asses.createAssociation(categories);
			return "redirect:/category/{id}";
		}

	}}

