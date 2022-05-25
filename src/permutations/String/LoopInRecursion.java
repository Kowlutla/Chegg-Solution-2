package permutations.String;

import java.util.Scanner;

public class LoopInRecursion {

	static String prefix="";
	static String rest;
	int initialvalue=0;
	static int maxvalue;
	public static void main(String[] args) {
		LoopInRecursion lr=new LoopInRecursion();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		rest=sc.nextLine();
		maxvalue=rest.length();
		prefix="";
		lr.printPermutations();
		sc.close();
	}

	void printPermutations()
	{
		//if rest is empty 
		if(rest.isEmpty())
		{
			//display the prefix string
			System.out.println(prefix);
		}
		else
		{
				Loop(prefix.length(),maxvalue-1);
		}	
	}
	
	void Loop(int i,int max)
	{
		if(i>=max)
		{
			return;
		}
		
		char c=rest.charAt(i);
		//add the character at the end of prefix
		prefix=prefix+c;
		//remove character from rest
		rest=rest.substring(0,i)+rest.substring(i+1);
		//use recursion to generate permutation with updated values for prefix and rest
		printPermutations();
		Loop(i+1,max);
	}
}
