package com.dresscode;

import java.util.Arrays;
import java.util.List;

public class Question {
	private String question;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	private List<String> answers;
	private int correctAnswer;

	public List<String> getrightAnswers() {
		List<String> result = Arrays.asList("Yes", "Yes", "Both Alike", "Madam Ada Lovelace", "Interconnected Network");
		return result;
	}
}
