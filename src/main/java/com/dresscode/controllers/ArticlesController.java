package com.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticlesController {
	
	@GetMapping("/articles") 
	public String articles() {
		return "articles";
	}

	
}
