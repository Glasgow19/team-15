package com.dresscode.controllers ;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizFinalController{
	@GetMapping("/Quiz")
	public String quiz(){
		return "Quiz";
	}
}
	
	
	