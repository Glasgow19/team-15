package com.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class artsController {
	@GetMapping("/arts")
	public String index() {
		return "arts";
	}
}
