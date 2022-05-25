package com.Chegg.Account;

public class Account {

	private double balance;

	private String name;

	private long acctNum;

	// -------------------------------------------------
	// Declare a private static integer variable numAccounts to hold this value
	// -------------------------------------------------
	private static int numAccounts = 0;

	// ----------------------------------------------

	// Constructor -- initializes balance and owner; generates random

	// account number

	// ----------------------------------------------

	public Account(double initBal, String owner)

	{
		balance = initBal;

		name = owner;

		acctNum = (int) (Math.random() * Integer.MAX_VALUE);
		// b. Add code to the constructor to increment this variable every time an
		// account is created.
		numAccounts++;
	}

	// -------------------------------------------------

	// Checks to see if balance is sufficient for withdrawal.

	// If so, decrements balance by amount; if not, prints message.
	
	// -------------------------------------------------
	public void withdraw(double amount)

	{
		if (balance >= amount)
			balance -= amount;

		else
			System.out.println("Insufficient funds");
	}

	// -------------------------------------------------

	// Adds deposit amount to balance.

	// -------------------------------------------------

	public void deposit(double amount) {
		balance += amount;
	}

	// -------------------------------------------------

	// Returns balance.

	// -------------------------------------------------

	public double getBalance() {

		return balance;
	}

	// -------------------------------------------------
	
	// c. Add a static method getNumAccounts that returns the total number of
	// accounts
	
	// -------------------------------------------------
	public static int getNumAccounts() {
		return numAccounts;
	}
	
	// -------------------------------------------------
	
	//Add a method void close() to your Account class
	
	// -------------------------------------------------
	public void close()
	{
		//close the current account by appending “CLOSED” to the account name
		this.name=this.name+"CLOSED";
		// setting the balance to 0
		this.balance=0;
		//decrement the total number of accounts.
		numAccounts--;
	}

	// -------------------------------------------------

	// Returns a string containing the name, account number, and balance.

	// -------------------------------------------------
	public String toString() {

		return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
	}

}