package com.example.accountserviceapp;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

	public Account fetchAccountById(long accountNumber) {
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setAmount(new Double(Math.random() * accountNumber).intValue());
		return account;
	}
}
