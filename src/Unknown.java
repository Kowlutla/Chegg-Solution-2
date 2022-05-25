import java.util.Stack;

public class Unknown {
	
	//method to reverse the stack
	static Stack<Integer>reverseStack(Stack<Integer>in)
	{
		//Create a new Stack Object
		Stack<Integer>newStack=new Stack<Integer>();
		
		//for all values in given stack
		while(!in.isEmpty())
		{
			//pop the current value in given stack
			int data=in.pop();
			//push that popped value into newStack
			newStack.push(data);
			//Do above steps until given stack become empty
		}
		
		//return newStack
		return newStack;
	}
	
	public static void main(String[] args) {
		
		Stack<Integer>stack=new Stack<Integer>();
		for(int i=1;i<=10;i++)
		{
			stack.push(i);
		}
		
		System.out.println(stack);
		Stack<Integer>newStack=reverseStack(stack);
		System.out.println(newStack);
	}

}
