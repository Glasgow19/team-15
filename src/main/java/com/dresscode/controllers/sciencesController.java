package com.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sciencesController {
	@GetMapping("/sciences")
	public String index() {
		return "sciences";
	}
}
