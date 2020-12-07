package com.example.springbootunitintegrationtestingdemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test1 {

	@Autowired
	private HelloController controller;
	
	// this will check whether the controller is instantiated or not
	@Test
	public void testControllerInstance() {
		assertThat(controller).isNotNull();
	}

}
