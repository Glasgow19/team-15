package com.dresscode.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dresscode.Question;
import com.dresscode.Quiz;

@Controller
public class QuizesController {
	private Quiz Q = new Quiz();

	@GetMapping("/quiz")
	public String quiz(@RequestParam(name = "Question", required = false, defaultValue = "NULL") String Question,
			Model model) {
		Question q = new Question();
		for (int i = 0; i < 5; i++) {
			q = Q.readQuestions();
			model.addAttribute("Question", q.getQuestion());
			List<String> s = q.getAnswers();
			model.addAttribute("Answers1", s.get(0));
			model.addAttribute("Answers2", s.get(1));
			model.addAttribute("Answers3", s.get(2));
		}
		return "quiz";
	}

	@GetMapping("/quizresult")
	public String quizResult(int f) {
		String result = "Abc";
		if (f == 2)
			result = "Yeah! You got that right!";
		else
			result = "Sorry! But your answer is wrong";
		return result;
	}

	@PostMapping("/quizComp")
	@ResponseBody
	public String quizComp(@RequestParam(name = "Result", required = false, defaultValue = "NULL") String result) {
		Question q = new Question();
		int flag = 1;
		List<String> res = q.getrightAnswers();
		if (res.get(Q.getCount()).equals(result))
			;
		flag = 2;
		return quizResult(flag);
	}

}
