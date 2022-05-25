package com.Chegg.Account;

import java.util.Scanner;
public class TestAccounts2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Names: ");
		String names[]=new String[3];
		// prompts for and reads in three names
		for(int i=0;i<3;i++)
		{
			names[i]=sc.next();
		}
		
		//creates an account with an initial balance of $100 for each 
		Account ac1=new Account(100,names[0]);
		Account ac2=new Account(100,names[1]);
		Account ac3=new Account(100,names[2]);
		
		//Print the three accounts
		System.out.println("Three Accounts are: ");
		System.out.println(ac1);
		System.out.println(ac2);
		System.out.println(ac3);
		
		ac1.close();
		
		System.out.println("Number of Accounts: "+Account.getNumAccounts());
		
		sc.close();
	}
}
