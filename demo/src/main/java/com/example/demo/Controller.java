package com.example.demo;
import java.util.Date;

import javax.xml.crypto.Data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;


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
