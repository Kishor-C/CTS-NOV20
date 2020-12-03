package com.example.restbasedspringbootapp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account { 
	private long accountNo;
	private double amount;
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
