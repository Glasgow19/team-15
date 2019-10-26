package com.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubjectController {
	@GetMapping("/subjects")
	public String index() {
		return "subjects";
	}
}
