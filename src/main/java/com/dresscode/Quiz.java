package com.dresscode;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Quiz {
	@Autowired
	ResourceLoader resourceLoader;
	
	@RequestMapping("/quiz")
	public List<Question> readQuestions() 
	{
		List<Question> questions = new ArrayList<Question>();
		try {
			File file = resourceLoader.getResource("classpath:data/questions.json").getFile();
			byte[] content = new byte[(int) file.length()];
			DataInputStream dis = new DataInputStream(new FileInputStream(file));
			dis.readFully(content);
			ObjectMapper mapper = new ObjectMapper();
			questions =Arrays.asList(mapper.readValue(content, Question[].class));

			for(int i = 0 ; i < questions.size() ; i++) {
				System.out.println(questions.get(i).getQuestion());
				List<String> s = questions.get(i).getAnswers();
				for(int j= 0 ; j<s.size() ; j++)
				System.out.println(s.get(j)) ;
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return questions;
	}
}
