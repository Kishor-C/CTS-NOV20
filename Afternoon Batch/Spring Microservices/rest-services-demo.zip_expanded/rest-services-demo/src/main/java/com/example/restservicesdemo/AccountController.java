package com.example.restservicesdemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/account")
public class AccountController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String hello() {
		return "Welcome to REST Service"; // this is a text
	}
	
	@RequestMapping(value = "details", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Account getAccount() {
		// you need to call the database 
		Account account = new Account(12345, 45300.0, "ICICI008");
		return account;
	}
	
	@RequestMapping(value = "debit/{accNum}/{amt}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)   
	//api/account/debit/12345/5000 (or) // api/account/debit/45678/500
	public Account debitAmount(@PathVariable("accNum") int accountNumber, @PathVariable("amt") double amount) {
		Account account = new Account(accountNumber, amount, "NA");
		return account;
	}
}
