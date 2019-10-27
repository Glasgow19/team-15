package com.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class musicController {
	@GetMapping("/home/subjects/music")
	public String index() {
		return "music";
	}
}
