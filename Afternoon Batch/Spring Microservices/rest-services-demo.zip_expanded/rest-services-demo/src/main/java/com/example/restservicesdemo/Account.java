package com.example.restservicesdemo;

public class Account {
	private int accountNumber;
	private double amount;
	private String ifsc;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountNumber, double amount, String ifsc) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.ifsc = ifsc;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
}
