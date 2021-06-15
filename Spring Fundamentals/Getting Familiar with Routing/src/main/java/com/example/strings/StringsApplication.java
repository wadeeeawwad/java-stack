package com.example.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}

	@RequestMapping("/")
	public String hellow() {
		String wadee = "Hello client What are You Doing";
		return wadee;

	}
	@RequestMapping("random")
	public String str2() {
		String str2 = "Spring Boot is Great! so easy to just respond with strings";
		return str2;

	}

}
