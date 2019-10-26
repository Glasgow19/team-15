package com.dresscode.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "<h1>Html is working</h1>";
	}

}
