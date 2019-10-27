package com.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class computingController {
	@GetMapping("/computing")
	public String index() {
		return "computing";
	}
}
