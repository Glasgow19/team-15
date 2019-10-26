package com.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuizesController {
	
	@GetMapping("/quiz") 
	public String Quiz() {
		return "Quiz";
	}
	
	@PostMapping("/quizComp")
	public String quizComp(String foo) {
		System.out.println(foo);
		return "Quiz";
	}
	

	
}
