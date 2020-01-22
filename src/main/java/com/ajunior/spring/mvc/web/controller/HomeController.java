package com.ajunior.spring.mvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		// Return to src/main/resources/templates/home.html
		return "/home";
	}
}
