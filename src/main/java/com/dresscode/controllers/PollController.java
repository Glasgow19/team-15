package com.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dresscode.model.Poll;

@Controller
public class PollController {
	@GetMapping("/poll")
	public String index() {
		return "poll";
	}
	
	
	@PostMapping(path = "/pollTest", consumes = "application/json", produces = "application/json")
	public void postPoll(@RequestBody Poll poll) {
	    //code
		System.out.println("in post for poll");
	}
}
