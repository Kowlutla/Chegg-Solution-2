package com.chegg.account;

public class BankAccount {

	// Attributes
	private String accountNumber;
	private String accountTitle;
	private double balance;

	/**
	 * Default Constructor initialze the BankAccount Object with default values Of
	 * attributes
	 */
	public BankAccount() {
	}

	/**
	 * Parameterized constructor that initializes the BankAccount with given
	 * parameters
	 * 
	 * @param accountNumber
	 * @param accountTitle
	 * @param balance
	 */
	public BankAccount(String accountNumber, String accountTitle, double balance) {
		this.accountNumber = accountNumber;
		this.accountTitle = accountTitle;
		/*
		 * if balance is less than 0,assign balance to 0 otherwise assign provided
		 * balance
		 */
		if (balance < 0) {
			this.balance = 0;
		} else {
			this.balance = balance;
		}
	}

	/**
	 * getter method for accountNumber
	 * 
	 * @return accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Setter method for accountNumber
	 * 
	 * @param accountNumber
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * getter method for accountTitle
	 * 
	 * @return accountTitle
	 */
	public String getAccountTitle() {
		return accountTitle;
	}

	/**
	 * Setter method for accountTitle
	 * 
	 * @param accountTitle
	 */
	public void setAccountTitle(String accountTitle) {
		this.accountTitle = accountTitle;
	}

	/**
	 * getter method for balance
	 * 
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * Setter method for balance
	 * 
	 * @param balance
	 */
	public void setBalance(double balance) {
		/*
		 * if balance is less than 0,assign balance to 0 otherwise assign provided
		 * balance
		 */
		if (balance < 0) {
			this.balance = 0;
		} else {
			this.balance = balance;
		}
	}

	/**
	 * toString method to return String representation of BankAccout Object
	 */
	@Override
	public String toString() {
		return "accountNumber=" + accountNumber + ", accountTitle=" + accountTitle + ", balance=" + balance;
	}
}
