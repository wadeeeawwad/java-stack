package com.example.TheCode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Thecode {
	@RequestMapping("/")
	public String index() {
	
		return "index.jsp";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam(value="code") String code,RedirectAttributes redirectAttributes) {
		if(code.equals("wadee"))
		{
			return ("redirect:/code");
		}else {
			 redirectAttributes.addFlashAttribute("error", "You must Work Hard");
			 return "redirect:/";
		}
	}

	
	@RequestMapping("/code")
	public String coder() {
		
		
		return "code.jsp";
	}

}
