package com.example.restbasedspringbootapp;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountController {	
	
	@RequestMapping(value = "/balance", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Account getBalance() {
		Account account = new Account();
		account.setAccountNo(12345);
		account.setAmount(50000);
		return account;
	}
}
