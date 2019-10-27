package com.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mathematicsController {
	@GetMapping("/home/subjects/mathematics")
	public String index() {
		return "mathematics";
	}
}
