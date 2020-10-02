package com.awad.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@RequestMapping("/welcome")
	public String welcome() {
		return "this is great, I see something on the screen";
	}

}