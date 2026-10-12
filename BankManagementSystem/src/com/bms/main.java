package com.bms;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== BANK MANAGEMENT SYSTEM =====");

        // Select account type
        System.out.println("\n1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("3. Salary Account");

        System.out.print("Enter account type: ");
        int choice = sc.nextInt();

        // Account details
        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account account;

        // Create selected account
        if (choice == 1) {

            account = new SavingAccounts(
                    accountNumber, name, balance);

        } else if (choice == 2) {

            account = new CurrentAccounts(
                    accountNumber, name, balance);

        } else if (choice == 3) {

            sc.nextLine();

            System.out.print("Enter Company Name: ");
            String companyName = sc.nextLine();

            account = new SalaryAccount(
                    accountNumber, name, balance, companyName);

        } else {

            System.out.println("Invalid account type!");
            sc.close();
            return;
        }

        System.out.println("\nAccount created successfully!");

        // Account menu
        int option;

        do {

            System.out.println("\n===== ACCOUNT MENU =====");
            System.out.println("1. Display Account Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {

                case 1:
                    account.displayAccountDetails();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();

                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();

                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println(
                            "Current Balance: " + account.getBalance());
                    break;

                case 5:
                    System.out.println(
                            "Thank you for using Bank Management System!");
                    System.out.println("***** Developed by YASH *****");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (option != 5);

        sc.close();
    }
}