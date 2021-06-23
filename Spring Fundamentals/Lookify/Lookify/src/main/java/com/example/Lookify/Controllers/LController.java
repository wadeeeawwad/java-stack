package com.example.Lookify.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Lookify.Models.LModels;
import com.example.Lookify.Servicies.LService;

@Controller
public class LController {
	private final LService lService;

	public LController(LService lService) {

		this.lService = lService;
	}

	@RequestMapping("/")
	public String home() {
		return "home.jsp";

	}

	@RequestMapping("/dashboard")
	public String home(Model model, @ModelAttribute("lokimodel") LModels lokimodel) {
		List<LModels> lokiobject = lService.getalltitles();
		model.addAttribute("lokiobject", lokiobject);
		return "/dashboard.jsp";

	}

	@RequestMapping(value = "/dashboard", method = RequestMethod.POST)
	public String addsong(@Valid @ModelAttribute("lokimodel") LModels lokimodel, BindingResult result) {
		if (result.hasErrors()) {
			return "/dashboard.jsp";
		} else {

		}
		lService.addsong(lokimodel);
		return "redirect:/dashboard";
	}

	@RequestMapping("/songs/new")
	public String songsnew(Model model, @ModelAttribute("lokimodel") LModels lokimodel) {
		List<LModels> lokiobject = lService.getalltitles();
		model.addAttribute("lokiobject", lokiobject);
		return "/songsnew.jsp";

	}

	@RequestMapping("dashboard/{id}/delete")
	public String delete(@PathVariable("id") long id) {
		lService.deletesong(id);
		return "redirect:/dashboard";
	}

	@RequestMapping("/songs/{id}")
	public String displaysong(@PathVariable("id") long id, Model model) {
		LModels song = lService.getsongbyId(id);
		model.addAttribute("song", song);
		return "song.jsp";
	}

	@RequestMapping(value = "/dashboard/search", method = RequestMethod.POST)
	public String getsong(@RequestParam(name = "search") String search, Model model) {
		List<LModels> objectsong = lService.getsearchedartist(search);
		model.addAttribute("objectsong",objectsong);
		
		return "songtitle.jsp";
	}

}
