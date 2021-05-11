package com.employee.sample.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class Data.
 */
public class Data {

	private Integer id;

	@JsonProperty(value = "first_name")
	private String firstName;

	@JsonProperty(value = "last_name")
	private String lastName;

	private String email;
	
	private String avatar;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", avatar=" + avatar + "]";
	}

}
