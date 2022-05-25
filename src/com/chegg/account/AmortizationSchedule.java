package com.chegg.account;

import java.util.Scanner;
public class AmortizationSchedule {

	public static void main(String[] args) {

		// Steps: 1) Create scanner
		Scanner sc = new Scanner(System.in);
		/* 2) Prompt the user to enter loan amount and declare double variable and
		 * relate to scanner input
		 */
		System.out.print("Enter Loan Amount: ");
		double loanAmount=sc.nextDouble();	
		/*3) Prompt the user to enter number of years and declare integer years 
		 * and relate to scanner input
		 */
		System.out.print("Enter Number Of Years: ");
		int years=sc.nextInt();
		/*4) Prompt the user to enter annual interest rate and declare double
		 *  variable and relate to scanner 
		 */
		System.out.print("Enter Annual Interest Rate: ");
		double annualRate=sc.nextDouble();
		
		/*5) Calculate monthly interest rate: first create a double variable 
		 * called monthlyRate which is equal to annualRate divided by 1200
		 */
		double monthlyRate=annualRate/1200;
		
		/*6) Calculate monthly payement: first create double variable called
		 *  monthlyPayement which is equal to
		 *  loanAmount times monthlyRate divied by (1 - 1 / Math.pow(1 + monthlyRate, years * 12));
		 */
		double monthlyPayment=(loanAmount*monthlyRate)/(1 - 1 / Math.pow(1 + monthlyRate, years * 12));
		
		/*
		 * 7) Display in console monthlyPayement
		 */
		System.out.println("Monthly Payment: "+monthlyPayment);
		
		/*
		 * 8) Display in console total amount with formula inside of prompt (monthlyPayement*12) * years);
		 */
		System.out.println("Total Amount: "+(monthlyPayment*12) * years);
		/*
		 * 9) Create so called amortization schedule:
		 * first create double variable called balance which is equal to loanAmount, principal, interest;
		 */
		double balance=loanAmount;
		double principal,interest;
		
		/*10) System.out.println ("Payment# Interest Principal Balance"); 
		 * for (int i = 1; i <= years * 12; i++) 
		 * { interest = monthlyRate * balance;
		 *  principal = monthlyPayment - interest; 
		 *  balance = balance - principal; 
		 *  System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest, principal, balance); 
		 *  }
		 */
		 System.out.println ("Payment# Interest Principal Balance"); 
		 for (int i = 1; i <= years * 12; i++) 
		 { 
			 interest = monthlyRate * balance; 
			 principal = monthlyPayment - interest; 
			 balance = balance - principal; 
			 System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest, principal, balance); 
		 }
		 sc.close();
	}
}
