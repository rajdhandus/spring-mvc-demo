package com.raj.spring;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	
	private LinkedHashMap<String, String> favouriteLanguageOptions;

	public Student(){
		favouriteLanguageOptions = new LinkedHashMap<>();
		favouriteLanguageOptions.put("Java", "Java");
		favouriteLanguageOptions.put("JavaScript", "JavaScript");
		favouriteLanguageOptions.put("C#", "C#");
		favouriteLanguageOptions.put("C++", "C++");
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public String getCountry(){
		return this.country;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setCountry(String country){
		this.country = country;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	
	public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
		return favouriteLanguageOptions;
	}

}
