package com.example.project.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.project.Services.LanguageService;
import com.example.project.models.language;

@Controller
public class languageController {

	private final LanguageService languageService;

	public languageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}

	@RequestMapping("/languages")
	public String home(Model model, @ModelAttribute("lang") language lang) {
		List<language> languages = languageService.getAllLanguages();
		model.addAttribute("languages", languages);
		return "/languages/home.jsp";

	}

	@RequestMapping(value = "/languages", method = RequestMethod.POST)
	public String addlanguage(@Valid @ModelAttribute("lang") language lang, BindingResult result) {
		if (result.hasErrors()) {
			return "/languages/home.jsp";
		} 
		else {
			languageService.addlanguage(lang);
			return "redirect:/languages";
		}
		
	}
	@RequestMapping("/languages/{id}/update")
	public String Updateedit(@PathVariable("id") long id , Model modelWadee) {
		language lang = languageService.findlanguage(id);
	modelWadee.addAttribute("lang", lang);
	return "/languages/update.jsp";}

	@RequestMapping(value="/languages/{id}",method=RequestMethod.PUT)
	public String Update(@Valid @ModelAttribute("lang") language lang, BindingResult result) {
		
		if (result.hasErrors()) {
			return "/languages/update.jsp";
		} 
		else {
			languageService.UpdateLanguage(lang);
			return "redirect:/languages";
		}


	}
	@RequestMapping("/languages/{id}/delete")
	public String delete(@PathVariable("id") long id ) {
		languageService.deletelanguage(id);
		return "redirect:/languages";
	
	}}
