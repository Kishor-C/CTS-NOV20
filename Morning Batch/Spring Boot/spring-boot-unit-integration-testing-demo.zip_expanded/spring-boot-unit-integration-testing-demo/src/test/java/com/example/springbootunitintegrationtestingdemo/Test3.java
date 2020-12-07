package com.example.springbootunitintegrationtestingdemo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = HelloController.class)
public class Test3 {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private HelloService service;
	
	@Test
	public void statusShouldBe202() throws Exception {
		when(this.service.defaultMessage()).thenReturn("Welcome Mock Data");
		this.mockMvc.perform(get("/hello")).andExpect(status().isAccepted());
	}
	@Test
	public void contentShouldHaveSomeMessage() throws Exception {
		when(this.service.defaultMessage()).thenReturn("Welcome Mock Data");
		this.mockMvc.perform(get("/hello")).andExpect(content().string(containsString("Welcome Mock Data")));
	}
}
