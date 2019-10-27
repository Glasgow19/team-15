package com.dresscode.controllers;
import java.util.List;

//import Quiz ;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dresscode.Question;
import com.dresscode.Quiz;

@Controller
public class QuizesController {
	@GetMapping("/quiz") 
	public String quiz(@RequestParam(name="Question", required=false, defaultValue="NULL") String Answers, Model model, Model model1, Model model2, Model model3) {
		Quiz Q = new Quiz();
		for(int i =0 ; i<5 ; i++) {
		Question q ;
		q = Q.readQuestions();
		model.addAttribute("Question", q.getQuestion()) ;
		List<String> s = q.getAnswers() ;
		model1.addAttribute("Answers1", s.get(0)) ;
		model2.addAttribute("Answers2", s.get(1)) ;
		model3.addAttribute("Answers3", s.get(2)) ;
		}
		return "quiz";
	}
	
	@PostMapping("/quizComplete")
	public String quizComp(String result) {
		
		
		return "Quiz";
	}
	

	
}
