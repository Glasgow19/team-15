package com.dresscode;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Quiz {
	@Autowired
	ResourceLoader resourceLoader;
	public static int count = 0;

	public Quiz() {
	}

	public Question readQuestions() {
		List<Question> questions = new ArrayList<Question>();
		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			byte[] content = classloader.getResourceAsStream("data/questions.json").readAllBytes();
			ObjectMapper mapper = new ObjectMapper();
			questions = Arrays.asList(mapper.readValue(content, Question[].class));

			for (int i = 0; i < questions.size(); i++) {
				System.out.println(questions.get(i).getQuestion());
				List<String> s = questions.get(i).getAnswers();
				for (int j = 0; j < s.size(); j++)
					System.out.println(s.get(j));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return questions.get(count);
	}

	public int getCount() {
		int c = count;
		count++;
		if (count == 5)
			count = 0;
		return c;
	}
}
