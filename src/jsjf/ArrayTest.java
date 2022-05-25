package jsjf;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		//creating ArrayStack object 
		ArrayStack<String>stk=new ArrayStack<String>();
		int menu=0;
		do {
			//displaying menu to user
			System.out.println("\nStack menu selection\n1.Push\n2.Pop\n3.Peek"
					+ "\n4.Empty\n5.size\n6.display\n7.toString\n0.stop");
			System.out.println();
			//Asking user to enter choice
			System.out.print("Enter your choice: ");
			menu=Integer.parseInt(input.next());
			switch(menu)
			{
					//if user enter 1 perform push
				case 1:
					System.out.print("Enter element: ");
					String element=input.next();
					stk.push(element);
					break;
					//if user enter 2 perform pop
				case 2:
					System.out.println("Removed Element is: "+stk.pop());
					break;
					//if user enter 3 perform peek
				case 3:
					System.out.println("Top Element is: "+stk.peek());
					break;
					//if user enter 4 check stack empty or not
				case 4:
					System.out.println("IsEmpty: "+stk.isEmpty());
					break;
					//if user enter 5 check stack size
				case 5:
					System.out.println("Size: "+stk.size());
					break;
				case 6:
					System.out.println("Stack elements are: ");
					stk.display();
					break;
				case 7:
					System.out.println("To String method: ");
					System.out.println(stk);
					break;
			}
			}while(menu!=0);//do performing till user enter 0
		System.out.println("\n* * * Thank You For Using * * *");
		input.close();
	}
}
