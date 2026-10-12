package com.bms;
import java.util.ArrayList;
public class AccountService {
	private ArrayList<Account> accounts = new ArrayList<>();
	
	public void addAccount(Account account) {
		accounts.add(account);
		System.out.println("Account Created Successfully");
	}
	public Account searchAccount(int accountNumber) {
		for(Account account : accounts) {
			if(account.getAccountNumber()==accountNumber) {
				return account;
			}
		}
		return null;
	}
	public void displayAllAccounts() {
		if(accounts.isEmpty()) {
			System.out.println("No Accounts Available.");
			return;
			
		}
		for(Account account : accounts) {
			account.displayAccountDetails();
			System.out.println("----------------------------------------");
		}
	}
}
