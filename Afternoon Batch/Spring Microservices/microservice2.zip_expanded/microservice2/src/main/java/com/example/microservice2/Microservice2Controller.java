package com.example.microservice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/m2")
public class Microservice2Controller {

	@Autowired
	private Microservice2Service service;
	
	@GetMapping
	public String method2() {
		return service.greets();
	}
}
