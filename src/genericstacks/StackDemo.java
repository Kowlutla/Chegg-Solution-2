package genericstacks;

public class StackDemo {

	public static void main(String[] args) {
		
		//Creating stack of type String
		Stack<String>s1=new Stack<String>();
		//chaecking stack is empty or not
		System.out.println(s1.isEmpty());
		//pushing string into stack
		s1.push("One");
		s1.push("Two");
		s1.push("Three");
		s1.push("Four");
		s1.push("Five");
		s1.push("Six");
		//printing contents of stack by calling toString method
		System.out.println(s1.toString());
		
		//printing top value value from stack
		System.out.println("Top value: "+s1.peek());
		//printing popped value value from stack
		System.out.println("Popped value: "+s1.pop());
		//printing size of stack
		System.out.println("Size: "+s1.size());
		//prinring contents of stack by calling toString method
		System.out.println(s1.toString());
	}
}
