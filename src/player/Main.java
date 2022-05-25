package player;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		
		 long num = 0;
		    int temp;
		    int secretNum = 0;

		//Show what is output by the following segment of code, if the input is 837298651020706. (4)
		    Scanner sc=new Scanner(System.in);
		    num=sc.nextLong();
		    num = Math.abs(num); 
		    while (num > 0)
		    {
		        stack.push((int) (num % 100)); 
		        num = num / 100;
		    }
		    while (!stack.isEmpty()) {

		        temp = stack.pop();
		       // stack.pop();
		        secretNum = secretNum + temp;
		    }
		    System.out.println("Sexrete "+secretNum);
	}
	

}
