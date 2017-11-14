package com.venky.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	/**
	 * @param args
	 */

	private String firstName;
	private String lastName;
	private String country;
	private String favlang;
	private LinkedHashMap<String, String> countryOptions;
	private String[] os;
	public Student(){
		countryOptions = 	new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
	}
	
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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


	public String getFavlang() {
		return favlang;
	}


	public void setFavlang(String favlang) {
		this.favlang = favlang;
	}


	public String[] getOs() {
		return os;
	}


	public void setOs(String[] os) {
		this.os = os;
	}
	

}
