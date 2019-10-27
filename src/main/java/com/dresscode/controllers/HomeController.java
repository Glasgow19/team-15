package com.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dresscode.facts;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String index(Model model) {
		model.addAttribute("fact",facts.factGen());
		return "home";
	}

}
