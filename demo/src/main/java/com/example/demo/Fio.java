package com.example.demo;

public class Fio {
	
	String name;
	String lastName;
	String fatherName;
	
	Fio(String name, String lastName, String fatherName){
		this.name = name;
		this.lastName = lastName;
		this.fatherName = fatherName;
	}
	
	public String crFio() {
		String str = lastName + " " + name + " " + fatherName;
		return str;
	}
}
