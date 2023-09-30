package com.example.demo.model;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// Аннотации ломбока на генерацию сеттеров, геттеров и конструктора
@Getter
@Setter
@AllArgsConstructor
public class Fio {
	
	@Pattern(regexp = "^[а-яА-ЯёЁa-zA-Z]+$")
	private String name;
	
	@Pattern(regexp = "^[а-яА-ЯёЁa-zA-Z]+$")
	private String lastName;
	
	@Pattern(regexp = "^[а-яА-ЯёЁa-zA-Z]+$")
	private String fatherName;
	
	@Override
	public String toString() {
		return lastName + " " + name + " " + fatherName;
	}

}
