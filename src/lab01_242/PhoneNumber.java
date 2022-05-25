package lab01_242;
	import java.util.Scanner;
	import java.util.Random;

public class PhoneNumber {

	public void main(String[] args) {

		String phonenum="";
		char option = 0;
		Scanner input=new Scanner(System.in);
		Random rand=new Random();
		do {
			System.out.println("Enter A for a Carlisle phone number.");
			System.out.println("Enter B for a Harrisburg phone number.");
			System.out.println("Enter C for a York phone number.");
			System.out.println("Enter D for a Lancaster phone number.");
			System.out.println("Please make your selection here -->");
			
			char c=input.next().charAt(0);
			char res=Character.toUpperCase(c);
			
			if(res=='A')
			{
				phonenum="551-";
			}
			else if(res=='B')
			{
				phonenum="552-";
			}
			else if(res=='C')
			{
				phonenum="553-";
			}
			else if(res=='D')
			{
				phonenum="554-";
			}
			
			System.out.println("Phone number is: "+phonenum);
		}while(option=='A' || option=='B' || option=='C' || option=='D');

	}

}
