package com.example.walletserviceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WalletService {

	@Autowired
	private RestTemplate rest;
	
	public Wallet addAmountToWallet(long accountNumber) {
		Wallet wallet = new Wallet();
		wallet.setName("Bruce");
		// let us try to add 50% of the amount from the account
		AccountStructure account = rest.getForObject("http://ACCOUNT-SERVICE/account/"+accountNumber, AccountStructure.class);
		wallet.setBalance(wallet.getBalance() + (account.getAmount() * 0.5));
		return wallet;
	}
	
}
