package com.awad.springboot.jpa;

public class User {

	private Long id;

	private String name;// Not perfect!! Should be a proper object!
	private String role;// Not perfect!! An enum should be a better choice!

	protected User() {
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

}
