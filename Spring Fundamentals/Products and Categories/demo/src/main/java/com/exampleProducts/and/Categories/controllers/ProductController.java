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
public class ProductController {
	private final ProductService productService;
	private final CategoryService categoryService;
	private final AssosiationServices Asses; 

	

	public ProductController(ProductService productService, CategoryService categoryService,
			AssosiationServices asses) {
		super();
		this.productService = productService;
		this.categoryService = categoryService;
		Asses = asses;
	}
	@RequestMapping("/")
	public String roduct() {
		return "redirect:/product/new";
	}
	@RequestMapping("/product/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "/product/newproduct.jsp";
	}

	@RequestMapping(value = "/product/new", method = RequestMethod.POST)
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "product/newproduct.jsp";
		} else {
			productService.createProduct(product);
			return "redirect:/product/new";
		}

	}

	@RequestMapping("/product/{id}")
	public String show(@ModelAttribute("acategories") categories acategories,@PathVariable("id") Long id, Model model) {
		Product product = productService.findProduct(id);
		List<Category> category = categoryService. withoutProductsCategory(product);
		model.addAttribute("product", product);
		model.addAttribute("category", category);
		return "/product/show.jsp";
	}
	
	
	@RequestMapping(value = "/product/{id}", method = RequestMethod.POST)

     public String createAss(@Valid @ModelAttribute("categories") categories categories, BindingResult result) {
		if (result.hasErrors()) {
			return "/newcategory.jsp";
		} else {
			Asses.createAssociation(categories);
			return "redirect:/product/{id}";
		}

	}

}
