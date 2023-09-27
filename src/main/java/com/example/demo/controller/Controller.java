package com.example.demo.controller;

import com.example.demo.model.Fio;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class Controller {
	@GetMapping("/api/current-time")
	public Date home() {
		return new Date(System.currentTimeMillis());
	}
	
	@PostMapping("/EnterFio") 
	String insert(@Valid @RequestBody Fio postFio)
	{
	    return "Hello, " + postFio.toString() + " !";
	}


}
