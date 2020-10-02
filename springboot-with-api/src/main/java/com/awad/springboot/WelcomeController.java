package com.awad.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.awad.service.WelcomeService;

@Controller
public class WelcomeController {
	@Autowired
	private WelcomeService service;
	
	@GetMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}
	
	@RequestMapping("/")
	public String home() {
		return "index.html";
	}
	

}
