package com.example.microservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("m1")
public class Microservice1Controller {

	@Autowired
	private Microservice1Service service;

	@GetMapping
	public String methodApi() {
		return service.method1();
	}
}
