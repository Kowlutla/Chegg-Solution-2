package distance;

import java.util.Scanner;

public class Point {

	public static void main(String[] args) {

		int firstnum,secnum,thirdnum,minnum;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		firstnum=input.nextInt();//Assume 11
		secnum=input.nextInt();//Assume 4
		thirdnum=input.nextInt();//Assume 34
		
		/*
		 * Error 1:only two parameters are passed to method
		 * Correction:pass three parameters to method
		 */
		minnum=find_min(firstnum,secnum,thirdnum);
		
		System.out.printf("The minimum of the three numbers is "+minnum);
		input.close();
	}

	/*
	 * Error2: no of arguments passed to method are only 2
	 * Correction:no of arguments to be pass method are 3
	 * 
	 * Error3:return type for method is void
	 * Correction:change return type to int
	 * */
	public static int find_min(int x, int y, int z) {
		int minimum=x;
		/*
		 * Error4:Logical operator used is ||
		 * Correction:Logical Operator should use &&
		 * 
		 * Error5:used if for every condition
		 * Correction:Use else if is statements
		 * */
		if((x<y) && (x<z))
		{
			minimum=x;
		}
		else if((y<x) && (y<z))
		{
			/*
			 * Error6:x assigned as minimum 
			 * Correction: assign y as minimum
			 * */
			minimum=y;
		}
		else if((z<x) && (z<y))
		{
			/*
			 * Error7:x assigned as minimum 
			 * Correction: assign z as minimum
			 * */
			minimum=z;
		}
		return minimum;
	}

	/*Error8: two extra closed parenthesis are added
	 * Correction: Remove extra two parenthesis
	 * */
}
