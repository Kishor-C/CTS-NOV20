package com.example.restbasedspringbootapp;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountController {	
	@GetMapping(value = "{accountNo}", produces = MediaType.APPLICATION_JSON_VALUE) 
	public Account getBalance(@PathVariable("accountNo") int accountNo) {
		System.out.println("Http method is GET");
		Account account = new Account();
		account.setAccountNo(accountNo);
		account.setAmount(new Double(Math.random() * accountNo).doubleValue());
		return account;
	}
	@PostMapping(value = "{accountNo}", produces = MediaType.APPLICATION_JSON_VALUE) 
	public Account getBalance2(@PathVariable("accountNo") int accountNo) {
		System.out.println("Http method is POST");
		Account account = new Account();
		account.setAccountNo(accountNo);
		account.setAmount(new Double(Math.random() * accountNo).doubleValue());
		return account;
	}
	@PutMapping(value = "{accountNo}", produces = MediaType.APPLICATION_JSON_VALUE) 
	public Account getBalance3(@PathVariable("accountNo") int accountNo) {
		System.out.println("Http method is PUT");
		Account account = new Account();
		account.setAccountNo(accountNo);
		account.setAmount(new Double(Math.random() * accountNo).doubleValue());
		return account;
	}
	@DeleteMapping(value = "{accountNo}", produces = MediaType.APPLICATION_JSON_VALUE) 
	public Account getBalance4(@PathVariable("accountNo") int accountNo) {
		System.out.println("Http method is DELETE");
		Account account = new Account();
		account.setAccountNo(accountNo);
		account.setAmount(new Double(Math.random() * accountNo).doubleValue());
		return account;
	}
	
}
