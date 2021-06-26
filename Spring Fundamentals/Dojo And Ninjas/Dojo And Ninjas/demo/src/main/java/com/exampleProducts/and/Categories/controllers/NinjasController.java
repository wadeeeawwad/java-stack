package com.exampleProducts.and.Categories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exampleProducts.and.Categories.models.Dojo;
import com.exampleProducts.and.Categories.models.Ninja;
import com.exampleProducts.and.Categories.services.DojoService;
import com.exampleProducts.and.Categories.services.NinjaService;

@Controller
public class NinjasController {
	private final NinjaService ninjaService;
	private final DojoService dojoService;
	public NinjasController(NinjaService ninjaService, DojoService dojoService) {
		super();
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}
	
	@RequestMapping("/ninja/new")
	public String newninja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojo = dojoService.withoutNinjaDojo();
		model.addAttribute("dojo", dojo);
		return "/ninja/newninja.jsp";
	}

	@RequestMapping(value = "/ninja/new", method = RequestMethod.POST)
	public String createdojo(@Valid @ModelAttribute("ninja") Ninja ninja,Model model, BindingResult result) {
		List<Dojo> dojo = dojoService.withoutNinjaDojo();
		model.addAttribute("dojo", dojo);
		if (result.hasErrors()) {
			return "/ninja/newninja.jsp";
		} else {
			ninjaService.createninja(ninja);
			return "redirect:/ninja/new";
		}

	}
	


}
