package com.venky.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.venky.springdemo.mvc.validation.CourseCode;

public class Customer {

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0,message="value must be >= zero")
	@Max(value=10,message="value must be <= 10")
	private Integer freepasses;
	
	@CourseCode(value="VEN",message="VEN undali modhatilo")
	private String courseCode;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 char/digits")
	private String postalcode;
	
	
	
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

	public Integer getFreepasses() {
		return freepasses;
	}

	public void setFreepasses(Integer freepasses) {
		this.freepasses = freepasses;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	
}
