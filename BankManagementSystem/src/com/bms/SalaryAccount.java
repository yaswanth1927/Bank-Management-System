package com.bms;

public class SalaryAccount extends Account {

	private String companyName;

	public SalaryAccount(int accountNumber, String accountHolderName, double balance,String companyName) {
		super(accountNumber, accountHolderName, balance);
		this.companyName = companyName;
	}
	public void displayAccountDetails() {
		super.displayAccountDetails();
		System.out.println("Company Name:"+companyName);
	}
}
