package com.exampleProducts.and.Categories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exampleProducts.and.Categories.models.Dojo;
import com.exampleProducts.and.Categories.services.DojoService;

@Controller
public class DojoController {
	private final DojoService dojoService;

	public DojoController(DojoService dojoService) {

		this.dojoService = dojoService;
	}

	@RequestMapping("/new/dojo")
	public String newdojo(@ModelAttribute("dojo") Dojo dojo) {
		return "/dojo/newdojo.jsp";
	}

	@RequestMapping(value = "/new/dojo", method = RequestMethod.POST)
	public String createdojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "/dojo/newdojo.jsp";
		} else {
			dojoService.createdojo(dojo);
			return "redirect:/new/dojo";
		}
		

	}
	@RequestMapping("/dojo/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Dojo dojo = this.dojoService.finddojo(id);
		model.addAttribute("dojo", dojo);
		return "/dojo/showDojos.jsp";
	}


}
