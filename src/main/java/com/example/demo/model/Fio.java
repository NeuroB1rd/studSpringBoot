package com.example.demo.model;

import jakarta.validation.constraints.Pattern;

public class Fio {
	
	@Pattern(regexp = "^[а-яА-ЯёЁa-zA-Z]+$")
	private String name;
	
	@Pattern(regexp = "^[а-яА-ЯёЁa-zA-Z]+$")
	private String lastName;
	
	@Pattern(regexp = "^[а-яА-ЯёЁa-zA-Z]+$")
	private String fatherName;
	
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
	
	Fio(String name, String lastName, String fatherName){
		this.name = name;
		this.lastName = lastName;
		this.fatherName = fatherName;
	}
	
	@Override
	public String toString() {
		return lastName + " " + name + " " + fatherName;
	}
}
