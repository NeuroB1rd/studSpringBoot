package com.example.demo;

public class Fio {
	
	private String name;
	private String lastName;
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
