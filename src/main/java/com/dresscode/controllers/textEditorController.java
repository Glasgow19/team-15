package com.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class textEditorController {

	@GetMapping("/home/textEditor")
	public String editor() {
		return "textEditor";
}
}
