package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class counter {
	int count1=0;
	@RequestMapping("/wadee")
	public String Welcome() {
		
		return "index.jsp";
		
		
	}
	@RequestMapping("/wadee/counter")
	public String counter1(HttpSession session) {
		session.setAttribute("count", count1+=1);
        Integer count = (Integer) session.getAttribute("count");
		return "counter.jsp";
		
		
	}

	
	
}
