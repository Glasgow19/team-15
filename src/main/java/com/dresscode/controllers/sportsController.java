package com.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sportsController {
	@GetMapping("/sports")
	public String index() {
		return "sports";
	}
}
