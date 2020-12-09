package com.example.microservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class Microservice1Service {

	@Autowired
	private RestTemplate restTemplate;

	// method1 calls microservice2
	@HystrixCommand(fallbackMethod = "buildFallBackForMethod1")
	public String method1() {
		System.out.println("method1() calling microserivce2");
		String response = null;
		response = restTemplate.getForObject("http://MICROSERVICE2/m2", String.class);
		return response;
	}
	public String buildFallBackForMethod1() {
		System.out.println("buildFallBackForMethod1() is called");
		return "Sorry, please try again later";
	}
}
