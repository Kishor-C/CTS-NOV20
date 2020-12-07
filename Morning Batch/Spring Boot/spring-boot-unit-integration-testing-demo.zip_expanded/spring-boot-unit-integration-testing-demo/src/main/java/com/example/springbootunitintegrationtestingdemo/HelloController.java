package com.example.springbootunitintegrationtestingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

	@Autowired
	private HelloService service;
	
	@GetMapping
	public ResponseEntity<String> greetings() {
		String result = service.defaultMessage();
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(result);
	}
}
