package com.example.demo;
import java.util.Date;

import javax.xml.crypto.Data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@GetMapping("/api/current-time") 
	public Date home() {
		return new Date(System.currentTimeMillis());
	}
	
	@PostMapping("/EnterFio") 
	String insert(@RequestBody Fio postFio)
	{
	    Fio objFio = new Fio(postFio.getName(), postFio.getLastName(), postFio.getFatherName());
	    return "Hello, " + objFio.toString() + " !";
	}
}
