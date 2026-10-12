package com.bms;

public class SavingAccounts extends Account {

	private double interestRate;

	public SavingAccounts(int accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestRate;
	}

	public void calculateInterest() {
		double interest = getBalance() * interestRate / 100;
		System.out.println("Interest Amount :" + interest);
	}
	@Override
	public void displayAccountDetails() {
		super.displayAccountDetails();
		System.out.println("Interest Rate :" + interestRate + "%");
	}
}
