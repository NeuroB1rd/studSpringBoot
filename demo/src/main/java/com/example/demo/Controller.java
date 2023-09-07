package com.example.demo;
import java.sql.Date;

import javax.xml.crypto.Data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@GetMapping("/api/current-time") public Date home() {
		Date date=new Date(System.currentTimeMillis());
	    return date;
	}
	@PostMapping("/EnterFio")
	String insert(@RequestBody Fio postFio)
	{
	    Fio objFio = new Fio(postFio.name, postFio.lastName, postFio.fatherName);
	    String mes = "Hello, " + objFio.crFio() + " !";
	    System.out.println(mes);
	    return mes;
	}
}
