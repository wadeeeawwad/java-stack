package com.example.dojo.survey;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class dojosuervey {
	@RequestMapping(value = "/data", method = RequestMethod.POST)
	public String Welcome(@RequestParam(value = "name") String name, @RequestParam(value = "language") String language,
			@RequestParam(value = "city") String city, @RequestParam(value = "comment") String comment,
			HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("language", language);
		session.setAttribute("city", city);
		session.setAttribute("comment", comment);

		return "redirect:/result";
	}

	@RequestMapping("/")
	public String home() {

		return "index.jsp";
	}

	@RequestMapping("/result")
	public String result() {

		return "result.jsp";
	}

}
