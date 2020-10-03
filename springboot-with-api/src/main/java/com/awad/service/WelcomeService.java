package com.awad.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
	public String retrieveWelcomeMessage() {
		return "Good Morning! updated again";
	}

}