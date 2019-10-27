package com.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticlesController {
	
	@GetMapping("home/articles") 
	public String articles() {
		return "articles";
	}

	
}
