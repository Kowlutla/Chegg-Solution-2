package palindrome;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		
		PalindromeChecker checker=new PalindromeChecker();
		Scanner sc=new Scanner(System.in);
		//Asking user to Enter text
		System.out.println("Enter text: ");
		String text=sc.nextLine();
		//printing user entered text
		System.out.print("Entered text is : \n\t");
		System.out.println(text);
		//Checking entered string is palindrome or not by calling isPalindrome method 
		System.out.println("is Palindrome: "+checker.isPalindrome(text));
		sc.close();
	}

	//Method to check String palindrome or not
	private  boolean isPalindrome(String text) {
		
		//create Queue and Stack Objects of type String
		LinkedQueue<String>charQueue=new LinkedQueue<String>();
		LinkedStack<String>charStack=new LinkedStack<String>();
		
		//Add the all characters to Queue and Stack
		for(int i=0;i<text.length();i++)
		{
			charStack.push(text.substring(i,i+1));
			charQueue.enqueue(text.substring(i, i+1));
		}
		
		//check for all characters in Queue and Stack
		while(!charQueue.isEmpty() && !charStack.isEmpty())
		{
			//take the current characters from Queue
			String q=charQueue.dequeue();
			//take the current characters from Stack
			String s=charStack.pop();
			//remove characters from queue until character is not space
			while(q.equals(" "))
			{
				q=charQueue.dequeue();
			}
			
			//remove characters from Stack until character is not space
			while(s.equals(" "))
			{
				s=charStack.pop();
			}
			
			//if current character of stack and Queue are not same return false
			if(!s.equals(q))
			{
				return false;
			}
		}
		//return true if all characters of queue matched with stack
		return true;
	}
}
