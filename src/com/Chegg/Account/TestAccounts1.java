package com.Chegg.Account;

import java.util.Scanner;
//d. File TestAccounts1.java
public class TestAccounts1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of bank accounts to create: ");
		int n=sc.nextInt();
		//creates the specified number of bank accounts
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter initial amount and owner for Account "+i);
			double balance=sc.nextDouble();
			String owner=sc.next();
			Account ac=new Account(balance,owner);
		}
		
		// uses the getNumAccounts method to find how many accounts were created.
		System.out.println("Number of Account created: "+Account.getNumAccounts());
		sc.close();
	}
}
