package com.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class socialSciencesController {
	@GetMapping("/socialSciences")
	public String index() {
		return "socialSciences";
	}
}
