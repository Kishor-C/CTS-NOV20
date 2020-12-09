package com.example.app1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("m3")
public class App3Controller {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping
	public String greetings() {
		LOG.info("::::: greetings in m3 ::::::::");
		return "Hello World";
	}
}
