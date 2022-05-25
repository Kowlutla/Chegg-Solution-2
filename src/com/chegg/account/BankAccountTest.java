package com.chegg.account;

import java.util.Scanner;
//Create a test class named BankAccountTest
public class BankAccountTest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//instantiate BankAccount object
		BankAccount account=new BankAccount();
		//asking user to enter account number
		System.out.print("Enter Account Number: ");
		String accountNumber=sc.next();
		//asking user to enter account title
		System.out.print("Enter Account Title: ");
		String accountTitle=sc.next();
		//asking user to enter balance
		System.out.print("Enter Balance: ");
		double balance=sc.nextDouble();
		
		//set the above taken attribute values to account
		account.setAccountNumber(accountNumber);
		account.setAccountTitle(accountTitle);
		account.setBalance(balance);
		
		//print account Object
		System.out.println(account);
		sc.close();
	}
}
