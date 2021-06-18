package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Human2 {

	@RequestMapping("/")
	public String Hellow() {
		String H = "wadeeeee";
		return H;

	}
}
