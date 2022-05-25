import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P2Tests {
	public static void main(String[] args) {
		
		//creating StringDLLEvaluationSubClass Object
		StringDLL list=new StringDLLEvaluationSubClass();
		
		//creating list Object to hold names
		List<String>names=new LinkedList<>();
		Scanner kb=new Scanner(System.in);
		//taking how many names to store from user
		int numberOfNames=kb.nextInt();
		//taking names from user
		for(int i=0;i<numberOfNames;i++)
		{
			names.add(kb.next());
		}
		
		//adding names to list
		System.out.println("Adding the following names with addFirst");
		for(String name:names)
		{
			System.out.println(name);
			list.addFirst(name);
		}
		
		//printing list in reversed order
		System.out.println("Reversed List: ");
		System.out.println(list.reverseToString());
		kb.close();
	}

}
