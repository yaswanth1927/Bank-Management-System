package com.bms;

public class CurrentAccounts extends Account {

	private double minimumBalance;

	public CurrentAccounts(int accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
		this.minimumBalance = minimumBalance;
	}
	
	public void checkMinimumBalance() {
		if(getBalance()>=minimumBalance) {
			System.out.println("Minimum Balance Maintained");
		}else {
			System.out.println("Warning: Minimum Balance Not Maintained!");
		}
	}
	@Override
	public void displayAccountDetails() {
		super.displayAccountDetails();
		System.out.println("Minimum Balance :"+minimumBalance);
	}

}
