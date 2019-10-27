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
	public int count ; 
	public Quiz(){
		count = -1 ;
	}
	public Question readQuestions() 
	{
		List<Question> questions = new ArrayList<Question>();
		try {
			//byte[] content = resourceLoader.getResource("classpath:data/questions.json").getInputStream().readAllBytes();
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			byte[] content = classloader.getResourceAsStream("data/questions.json").readAllBytes();
			ObjectMapper mapper = new ObjectMapper();
			questions =Arrays.asList(mapper.readValue(content, Question[].class));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}count++ ;
		return questions.get(count) ;
		
	}
}
