package com.awad.springboot.jpa;

public class User {

	private Long id;

	private String name;// Not perfect!! Should be a proper object!
	private String role;// Not perfect!! An enum should be a better choice!

	protected User() {
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

}
