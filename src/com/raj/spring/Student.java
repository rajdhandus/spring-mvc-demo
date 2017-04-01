package com.raj.spring;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	
	private LinkedHashMap<String, String> options;

	
	public Student(){
		options = new LinkedHashMap<String, String>();
		options.put("Brazil", "Brazil");
		options.put("Russia", "Russia");
		options.put("India", "India");
		options.put("China", "China");
		options.put("South Africa", "South Africa");
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
	
	public LinkedHashMap<String, String> getOptions() {
		return options;
	}

	public void setOptions(LinkedHashMap<String, String> options) {
		this.options = options;
	}

}
